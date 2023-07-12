package decorator;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("data2.txt");
		    dos = new DataOutputStream(fos);
			dos.writeByte('D');
			dos.writeChar('가');
			dos.writeInt(48);
			dos.writeFloat(2.54F);
			dos.writeUTF("감사합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Done");
	}
}
