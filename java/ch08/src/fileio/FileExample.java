package fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		File file = new File("c:/file/newFile.txt");
		file.createNewFile();
		
		System.out.println(file.isFile()); // 파일o
		System.out.println(file.isDirectory()); // 파일x
		System.out.println(file.getName()); // 파일 이름
		System.out.println(file.getPath()); // 파일 경로
		System.out.println(file.length() + "B"); // 파일의 용량
		// System.out.println("파일 생성");
		
		
	}
}
