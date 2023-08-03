package ser_p;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardServive;
import model_p.BoardDAO;
import model_p.BoardDTO;

public class BList implements BoardServive{
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "게시판목록");
		System.out.println("BList.execute() 실행");
		
		request.setAttribute("mainData", new BoardDAO().list());
	}
}
