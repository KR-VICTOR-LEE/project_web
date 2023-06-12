package fileio.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class readerTest {
	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("data.txt");

		int data;
		/*
		 * while (true) { data = fr.read(); if (data == -1) { break; } fr.close(); }
		 */
		while((data=fr.read())!= -1) {
			System.out.println((char)data);
		}
		fr.close();
	}
}
