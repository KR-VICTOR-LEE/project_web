package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample2 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("c:/file/test2.db");
		
		byte[] buffer = new byte[10];
		
		while(true) {
			int readByte = is.read(buffer);  //인덱스 0번부터 1번씩 읽음
			if(readByte == -1) break;
			for(int i=0; i<readByte; i++) {
				System.out.print(buffer[i] + " ");
			}
		}
		is.close();
	}

}
