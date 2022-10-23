package textfile;

import java.io.BufferedReader;
import java.io.FileInputStream;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text {
	public static void main(String[] args) throws IOException {
		
		FileInputStream input = new FileInputStream("C:\\Users\\全己林\\Desktop\\test1.txt");
		InputStreamReader reader = new InputStreamReader(input, "UTF-8");
		BufferedReader in = new BufferedReader(reader);
		//FileReader fr = new FileReader("C:\\Users\\全己林\\Desktop\\test1.txt");
		
		int ch;
		while((ch = in.read())!=-1) {
			System.out.print((char)ch);
		}
	}

}
