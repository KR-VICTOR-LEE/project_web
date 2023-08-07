package gal_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import control.GalleryService;
import model_p.BoardDAO;
import model_p.GalleryDAO;

public class GDetail implements GalleryService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","갤러리 상세");
		System.out.println("GDtail.execute() 실행");
		
		int fid = Integer.parseInt(request.getParameter("fid"));
		new GalleryDAO().addCount(fid);
		request.setAttribute("mainData",new GalleryDAO().detail(fid));
	}

}
