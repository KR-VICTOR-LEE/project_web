package systems;

public class SystemTime {
	public static void main(String[] args) {
		//수행 시간 측정
	    double start, end;
		start = System.currentTimeMillis();
		
		long sum = 0;
		for(int i=1; i<1000000000; i++) {
			sum += i;
		}
		end = System.currentTimeMillis();
		
		System.out.println("합계: " + sum);
		//1ms - 1/1000
		System.out.printf("계산에 %.2f초가 소요되었습니다.", (end-start)/1000);
	}
}
