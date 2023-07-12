package classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> class1 = Class.forName("java.lang.String");
		System.out.println(class1.getName());
		
		Constructor<?>[] cons = class1.getConstructors();
		for(Constructor<?> c : cons) {
			System.out.println(c);
		}
		
		Field[] fields = class1.getDeclaredFields();
		for(Field field : fields)
			System.out.println(field);
	}

}
