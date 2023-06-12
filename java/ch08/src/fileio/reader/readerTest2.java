package fileio.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class readerTest2 {
	public static void main(String[] args) throws IOException {
		Reader fr = null;
		try {
			fr = new FileReader("data.txt");
			int data;
			
			while ((data = fr.read()) != -1) {
				System.out.println((char) data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
