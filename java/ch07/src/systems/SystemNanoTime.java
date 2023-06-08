package systems;

public class SystemNanoTime {
	public static void main(String[] args) {
		
		double start, end;
		start = System.nanoTime();
		
		long sum =0;
		for (int i = 1; i < 100000000; i++) {
			sum += i;
		}
		end = System.nanoTime();
		System.out.printf("계산에 소요된 시간: %f나노초\n", (end-start));
		System.out.printf("계산에 소요된 시간: %f나노초\n", (end-start)/100000000);
	}
}
