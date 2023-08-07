package gal_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import control.GalleryService;
import model_p.BoardDAO;
import model_p.GalleryDAO;
import model_p.PageData;

public class GList implements GalleryService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		request.setAttribute("mainTitle","갤러리 목록");
		
		PageData pd = (PageData)request.getAttribute("pd");
		
		pd.calc();
		System.out.println("GList.execute() 실행:"+pd.page);

		request.setAttribute("mainData",new GalleryDAO().list());
		
		
	}

}
