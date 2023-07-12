package string;

public class SubStringTest {

	public static void main(String[] args) {
		
		String ssn = "940607-2345678";
		
		String firstPart = ssn.substring(0, 6); //끝 인수에서 1을 뺀다.
		System.out.println(firstPart);
		
		String secondPart = ssn.substring(7); //7번 문자부터 추출함
		System.out.println(secondPart);
		
		String uri = "/board/boardList.jsp";
		int index = uri.lastIndexOf("/");
		System.out.println(uri.substring(index)); // '/'부터 추출함
	}
}
