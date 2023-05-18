package methods;

public class OneUp2 {

	static int x = 0;  //정적 변수(전역변수임) 선언
	
	public static int oneUp() {
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(oneUp());  //1
		System.out.println(oneUp());  //2
		System.out.println(oneUp());  //3
		
		System.out.println(x); //누적된(공유) x값
	}

}
