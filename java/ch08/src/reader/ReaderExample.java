package reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		
		try(Reader fr = new FileReader("data.txt")){
			/*int i;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
			}*/
			
			while(true) {
				int i = fr.read();
				if(i == -1) break;
				System.out.print((char)i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
