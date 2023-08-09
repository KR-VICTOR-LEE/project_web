package di_p.main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Student;


public class StudentMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/student.xml");
		
		Student student1 = context.getBean("st1",Student.class);
		Student student2 = context.getBean("st2",Student.class);
		Student student3 = context.getBean("st3",Student.class);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		
		
	}
	
}
