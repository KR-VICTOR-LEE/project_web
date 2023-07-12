package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {
		
		long start=0, end=0;
		String originFile = "c:/file/ojdbc8.jar";
		String copyFile = "c:/file/jdbc8-2.jar";

		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile)){
			start = System.currentTimeMillis();
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			end = System.currentTimeMillis();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		System.out.printf("복사 소요 시간: %dms", (end-start));
	}
}
