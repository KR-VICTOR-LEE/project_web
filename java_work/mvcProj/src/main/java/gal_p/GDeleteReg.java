package gal_p;

import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.GalleryDAO;
import model_p.GalleryDTO;
import model_p.PageData;

public class GDeleteReg implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
	
		
		String path = request.getRealPath("up");
		path = "C:\\green_project\\java_work\\mvcProj\\src\\main\\webapp\\up";

		PageData pd = (PageData)request.getAttribute("pd"); 
		
		GalleryDTO dto = new GalleryDTO();
		dto.setFid( Integer.parseInt(request.getParameter("fid")));
		
		dto.setFpw( request.getParameter("fpw"));
		
		String msg = "비밀번호가 일치하지 않습니다.";
		String goUrl = "GDeleteForm?fid="+dto.getFid()+"&page="+pd.page;
		
		System.out.println(dto);
		//id/pw 검사 및 파일정보가져오기
		GalleryDTO delDto = new GalleryDAO().idPwChk(dto);
		
		if(delDto!=null) {//id, pw 가 일치한다면
			
			if(!delDto.getFupfile().equals("")) { //파일이 존재한다면
				//파일 삭제
				new File(path+"\\"+delDto.getFupfile()).delete();
			}
			//DB 에서 삭제
			new GalleryDAO().delete(dto);
			msg = "삭제되었습니다.";
			goUrl = "BList?page="+pd.page;
		}
				
		request.setAttribute("mainPage", "alert");
		request.setAttribute("msg",msg);
		request.setAttribute("goUrl",goUrl);
		
		
	}

}
