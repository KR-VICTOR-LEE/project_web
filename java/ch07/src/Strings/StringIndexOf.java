package Strings;

public class StringIndexOf {

	public static void main(String[] args) {
	
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if (location != -1) { // 못찾으면 -1을 반환, location >= 0
			System.out.println("자바와 관련된 책입니다.");
		}else {
			System.out.println("자바와 관련이 없는 책입니다.");
		}
		// lastIndexOf()
		String url = "/board/boardList.jsp";
		int uri_idx1 = url.indexOf('/'); // 앞에있는 '/'
		System.out.println(uri_idx1);
		
		int uri_idx2 = url.lastIndexOf('/'); // 뒤에있는 '/'
		System.out.println(uri_idx2);
	}
}
