import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DistributedFileSystem;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
public class ReadFromHDFS {

    public static void main(String[] args) throws Exception {
    	System.out.println("Start Read From HDFS . . .");
        Configuration conf = new Configuration();
        conf.set("fs.hdfs.impl", org.apache.hadoop.hdfs.DistributedFileSystem.class.getName());
        conf.set("fs.file.impl", org.apache.hadoop.fs.LocalFileSystem.class.getName());
        String dest = "/data/netflix/10000000.csv";
        conf.set("fs.defaultFS", "hdfs://163.221.29.42:8020");
        conf.set("mapreduce.framework.name", "yarn");
        conf.set("yarn.resourcemanager.address", "163.221.29.42:8032");
        FileSystem fileSystem = FileSystem.get(conf);
        Path dstPath = new Path(dest);
        FSDataInputStream in = fileSystem.open(dstPath);
        // Check if the file already exists
        if (!(fileSystem.exists(dstPath))) {
        System.out.println("No such destination " + dstPath);
        return;
        }
        // Get the filename out of the file path

        try{        
        String filename = dest.substring(dest.lastIndexOf('/') + 1, dest.length());
                OutputStream out = new BufferedOutputStream(new FileOutputStream(
                new File(filename)));
                byte[] b = new byte[1024];
                int numBytes = 0;
                while ((numBytes = in.read(b)) > 0) {
                out.write(b, 0, numBytes);
                }

        }catch(Exception e){
        System.err.println("Exception caught! :" + e);
        System.exit(1);
        }finally{
            in.close();
        fileSystem.close();
        }

    }

}