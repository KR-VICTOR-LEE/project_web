package reader;

import java.io.FileReader;

public class ReaderSample2 {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("word.txt")){
			int data;
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
