package whileexample;

public class While1 {
	public static void main(String[] args) {
		
		// 1 ~ 10 까지 출력, 합계 계산
		int i = 0; // 반복변수
		int sumVal = 0; // 합계 저장 변수
		
		while(i < 10) {
			i++; // i = i + 1
			sumVal += i;
			
			System.out.println("i="+ i + ", sumVal=" + sumVal);
		}
		System.out.println("합게 : " + sumVal);
		
		
	}
}
