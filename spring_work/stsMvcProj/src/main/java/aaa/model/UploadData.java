package aaa.model;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UploadData {
	String id, ff1Name, ff2Name;
	int age;
	MultipartFile ff1, ff2;
	
	public String getFileName() {
		return ff1.getOriginalFilename();
	}
	public String getFileName2() {
		return ff2.getOriginalFilename();
	}
	
}
