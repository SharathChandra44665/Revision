package readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Read_text {
	public void read_method() throws Exception {
		File myfile=new File("D:\\eclipse\\read_file.txt");
		FileReader read_file=new FileReader(myfile);
		BufferedReader b_file=new BufferedReader(read_file);
		String s= b_file.readLine();
//		System.out.println(s);
		while (s!=null) {
			System.out.println(s);
			s=b_file.readLine();
		}
	}

}
