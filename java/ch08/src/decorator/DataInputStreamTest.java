package decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("data2.txt");
			DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.readByte());  //코드값으로 읽어옴
			//System.out.println((char)dis.readByte());  
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
