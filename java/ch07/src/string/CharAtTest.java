package string;

public class CharAtTest {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(0);
		System.out.println(charValue);
		
		String ssn = "990815-1234567";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1': case '3': 
			System.out.println("성별은 남자입니다."); break;
		case '2': case '4':
			System.out.println("성별은 여자입니다."); break;
		}
	}

}
