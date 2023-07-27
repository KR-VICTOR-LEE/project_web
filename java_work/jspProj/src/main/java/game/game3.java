package game;

import java.util.Arrays;

public class game3 {

	public static void main(String[] args) {
		System.out.println("숫자 합 구하기.");
		
		System.out.println(Arrays.toString(args));
		
		int sum = 0;
		int count = 0;
		int avg = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MAX_VALUE;
		
		for(String str : args) {
			int result = Integer.parseInt(str);
			if (result%2==0) {
				sum += result; 
				count++;
				avg = sum / count;
				
				System.out.println("짝수 : "+ result);
				
				
			}
		}
		System.out.println("-----------");
		System.out.println("짝수의 갯수 : " +count);
		System.out.println("짝수의 합 : "+sum);
		System.out.println("평균 : " + avg);
	//	System.out.println("최대값 : "+ max);
		
		
	}

}
