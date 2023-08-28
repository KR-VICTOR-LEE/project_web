package aaa.model;

import jakarta.servlet.http.HttpServletRequest;
import lombok.Data;

@Data
public class PageData {

	String msg, goUrl;
	
	// int start = 0;
	int limit = 3;
	int pageLimit = 4;
	
	int page, start, pageStart, pageEnd ,total, pageTotal;
	
	public PageData (HttpServletRequest request) {
		page = Integer.parseInt(request.getParameter("page"));
	}
	
	
	
	public void calc() {
		// this.total = new BoardDAO().totalCnt();
		pageTotal = total/limit;
		
		if(total%limit>0) {
			pageTotal++;
		}
		
		start = (page-1)*limit;
		pageStart = (page-1)/pageLimit * pageLimit+1;
		pageEnd = pageStart + pageLimit -1;
		
		if(pageEnd > pageTotal) {
			
			pageEnd = pageTotal;
		}
	}
}
