import java.io.InputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class HDFSDemo {

	public static final String HDFS_ROOT_URL="hdfs://163.221.29.42:9000";
	private Configuration conf;

	public static void main(String[] args) throws Exception {
		System.out.println("HDFS DEMO . . .");
		HDFSDemo demo = new HDFSDemo();
		String uri = HDFS_ROOT_URL+"/data/output_data_naist/10000000.csv";
		demo.printHDFSFileContents(uri);
	}
	
	public HDFSDemo() {
		conf = new Configuration();
	}
	
	public void printHDFSFileContents(String uri) throws Exception {
		FileSystem fs = FileSystem.get(URI.create(uri), conf);
		InputStream in = null;
		try {
			in = fs.open(new Path(uri));
			IOUtils.copyBytes(in, System.out, 4096, false);
		} finally {
			IOUtils.closeStream(in);
		}
	}

}