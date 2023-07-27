package game;

public class game2 {

	public static void main(String[] args) {

		System.out.println("3,6,9 게임");
		// int a [] = {3,6,9};
		for (int i = 1; i < 20; i++) {
			int one = i % 10;
			int three = one % 3;
			try {
				int a = 1234/three;
				System.out.println(i);
			} catch (Exception e) {
				try {
					int a = 123/one;
					System.out.println("짝");
				} catch (Exception e2) {
					System.out.println(i);
				}
			}
		}
	}

}
