<%@page import="model_p.GalleryDTO"%>
<%@page import="model_p.PageData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	PageData pd = (PageData)request.getAttribute("pd"); 
	GalleryDTO dto = (GalleryDTO)request.getAttribute("mainData");
	
%>
<table border="">
	<tr>
		<td width="200px">id</td>
		<td width="700px"><%=dto.getFid() %></td>
	</tr>
	<tr>
		<td>제목</td>
		<td><%=dto.getTitle() %></td>
	<tr>
		<td>조회수</td>
		<td><%=dto.getCnt() %></td>
	</tr>
	<tr>
		<td>파일</td>
		<td><img width="500px" src="/mvcProj/up/<%=dto.getFupfile() %>"
			alt="" /></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><%=dto.getFcontent() %></td>
	</tr>
	<tr>
		<td colspan="2" align="right"><a href="GList?page=<%=pd.page%>">목록으로</a>
			<a href="GDeleteForm?fid=<%=dto.getFid()%>&page=<%=pd.page%>">삭제</a>
			<a href="GModifyForm?fid=<%=dto.getFid()%>&page=<%=pd.page%>">수정</a>
			<a href="GReplyForm?fid=<%=dto.getFid()%>&page=<%=pd.page%>">답변</a></td>
	</tr>
</table>