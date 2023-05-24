package protectedex.pack1;

public class B {
	public void method() {
		// protected 접근 제한자 사용됨
		A a = new A();
		a.filed = "OK";
		a.method();
	}
}
