package whileexample;

public class While2 {
	public static void main(String[] args) {
		
		// while문 - 반복조건문(if~break)
		int i = 0;
		
		while(true) {
			i++;
			if(i > 10) {
				break;
			}
			System.out.println(i);
		}
	}
}
