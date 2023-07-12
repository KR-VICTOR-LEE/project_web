package string;

public class StringConcatTest {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("주소값: " + System.identityHashCode(javaStr));
		
		//연결
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("주소값: " + System.identityHashCode(javaStr));
	}

}
