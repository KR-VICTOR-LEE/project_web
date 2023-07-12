package collections.set;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class StudentTest {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student ("이순신"));
		set.add(new Student ("이순신"));
		set.add(new Student ("세종대왕"));
		set.add(new Student ("홍길동"));
		
		System.out.println(set.size());
		
		
		Iterator<Student> ir = set.iterator();
		while (ir.hasNext()) {
			Student std = ir.next();
			System.out.println(std);
		}
		System.out.println("==========================");	
		
		for(Student std : set)
			System.out.println(std);
		
	}
}
