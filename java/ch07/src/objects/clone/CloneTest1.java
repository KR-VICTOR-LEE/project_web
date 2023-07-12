package objects.clone;

public class CloneTest1 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 40, 30};
		int[] arr2 = new int[4];
		
		arr2 = arr1.clone();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
