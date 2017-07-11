import java.io.*;
import java.util.*;
import java.net.*;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
//import org.apache.hadoop.mapred.*;
import org.apache.hadoop.util.*;
 
public class Cat{
        public static void main (String [] args) throws Exception{
        		System.out.println("Start . . .");
                try{
                        Path pt=new Path("hdfs://163.221.29.42:8020/data/output_data_naist/10000000.csv");
                        FileSystem fs = FileSystem.get(new Configuration());
                        BufferedReader br=new BufferedReader(new InputStreamReader(fs.open(pt)));
                        String line;
                        line=br.readLine();
                        while (line != null){
                                System.out.println(line);
                                line=br.readLine();
                        }
                }catch(Exception e){
                	System.out.println(e);
                }
        }
}