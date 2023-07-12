package innerclass;

class A{
	A(){System.out.println("A 객체 생성");}
	
	class B{
		int field1;
		
		B(){System.out.println("B 객체 생성");}
		
		void method1() {System.out.println("B method()");}
	}
	
	static class C{
		int field1;
		static int field2;
		
		C(){System.out.println("C 객체 생성");}
		
		static void method2(){System.out.println("C method()");}
	}
	
	void method() {
		class D{
			int field1;
			D(){System.out.println("D 객체 생성");}
			void method1() {System.out.println("D method()");}
		}
		D d = new D();
		d.field1 = 7;
		d.method1();
	}
	
}


public class NestedClassTest {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 5;
		b.method1();
		
		A.C c = new A.C();
		A.C.field2 = 6;
		A.C.method2();
		
		a.method();
	}
}
