package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {
	public static void main(String[] args) {
		// 이미지 파일을 읽고 쓰기(복사0
		String originFile = "c:/file/bg0.jpg"; // 원본
		String copyFile = "c:/file/bg1.jpg"; // 사본
		long start = 0, end = 0;
		try {
			FileInputStream fis  = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			start = System.currentTimeMillis();
			int i;
			while((i = fis.read()) != -1) { // 이미지 파일 읽음
				fos.write(i); // 이미지 쓰기
			}
			end = System.currentTimeMillis();
		} catch (IOException e) {
			
		}
		
		System.out.printf("파일 복사 소요시간 : %dms\n "+(end-start)+"ms");
	} // main
}
