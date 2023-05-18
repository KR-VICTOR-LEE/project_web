package array;

public class ArrayCopy2 {

	public static void main(String[] args) {
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		// 배열복사
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
			System.out.println(arr2[i]+ " ");
		}
		System.out.println();
		
		// 역순 복사 (arr1 -> arr3) N E T -> T E N
		for (int i = 0; i < arr3.length; i++) {
			arr3[2-i] = arr1[i];
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]+ " ");
		}
	}

}
