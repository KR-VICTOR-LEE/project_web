package systems;

public class SystemTime2 {
	public static void main(String[] args) {
		//수행 시간 측정
		double start, end;
		start = System.nanoTime();
		
		long sum = 0;
		for(int i=1; i<1000000000; i++) {
			sum += i;
		}
		end = System.nanoTime();
		
		System.out.println("합계: " + sum);
		System.out.printf("계산에 %.0f나노초가 소요되었습니다.\n", (end-start));
		//1ns = 1/10억
		System.out.printf("계산에 %.2f초가 소요되었습니다.", (end-start)/1000000000);
	}
}
