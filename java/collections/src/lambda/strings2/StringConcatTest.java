package lambda.strings2;

public class StringConcatTest {
	public static void main(String[] args) {
		StringConcat concat;
		
		// 람다식
		concat = (x,y) -> System.out.println(x+", "+y);
		concat.makeString("green", "computer");
	}
}
