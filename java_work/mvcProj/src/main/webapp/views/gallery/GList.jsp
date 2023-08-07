<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model_p.GalleryDTO"%>
<%@page import="java.util.ArrayList"%>
<style>
li{
	
	list-style: none;
}

</style>

<table>
	<h2>Gallery</h2>
	<%
	int i = 0;
	for (GalleryDTO dto : (ArrayList<GalleryDTO>) request.getAttribute("mainData")) {
		i++;
	%>
	<tr>
		<td>
			<ul>
				<li><%=dto.getFid()%></li>
				<li>제목<%=dto.getTitle()%></li>
				<li><a href="GDetail?fid=<%=dto.getFid()%>">
				<img width="200px" height="100px"
					src="/mvcProj/up/<%=dto.getFupfile()%>" alt="" /></a></li>
				<li>내용<%=dto.getFcontent()%></li>
				<li>조회수<%=dto.getCnt()%></li>
			</ul>
		</td>
	</tr>
	<%}	%>
</table>