package model_p;

import java.util.regex.Pattern;

public class GalleryDTO {
	String  fpw, title, fupfile, fcontent;
	int  fid ,cnt;
	public String getFpw() {
		return fpw;
	}
	public void setFpw(String fpw) {
		this.fpw = fpw;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFupfile() {
		if (fupfile == null || fupfile.trim().equals("null")) {
			fupfile = "";
		}
		return fupfile;
	}
	
	public boolean isImg() {
		boolean res = Pattern.matches(".*[.](jpg|bmp|png|gif)", getFupfile().toLowerCase()); 
		// img파일이 img파일이 맞는지 확인
		return res;					  
	}
	
	public void setFupfile(String fupfile) {
		this.fupfile = fupfile;
	}
	public String getFcontent() {
		return fcontent;
	}
	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "GalleryDTO [fpw=" + fpw + ", title=" + title + ", fupfile=" + fupfile + ", fcontent=" + fcontent
				+ ", fid=" + fid + ", cnt=" + cnt + "]";
	}	
	
}
