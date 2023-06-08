package Strings;

public class StringSubstring {
	public static void main(String[] args) {
		
		// substring(인수1, 인수2) - 인수1에서 시작해서 인수2까지 문자 추출
		String ssn = "940608-2345678";
		String firstpart = ssn.substring(0, 6);
		System.out.println(firstpart);
		
		// substring(인수1) - 인수1부터 끝까지 문자 추출
		String secondpart = ssn.substring(7);
		System.out.println(secondpart);
		
		// url 경로 추출
		String uri = "/board/boardList.jsp";
		int uri_idx = uri.lastIndexOf('/');
		System.out.println(uri.substring(uri_idx));
	}
}
