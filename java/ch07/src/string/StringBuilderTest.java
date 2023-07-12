package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("주소값: " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 주소값: " + System.identityHashCode(buffer));
		
		buffer.append(" and ");
		buffer.append("android");
		
		System.out.println("연산 후 buffer 주소값: " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
	}

}
