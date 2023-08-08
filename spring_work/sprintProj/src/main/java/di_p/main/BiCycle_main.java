package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Bicycle;
import di_p.Camera;
import di_p.HandPhone;

public class BiCycle_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/bicycle.xml");

		
		for (String str : "bc1,bc2,bc3".split(",")) {
			Bicycle bc = context.getBean(str,Bicycle.class);
			System.out.println(bc);
		}
		
	}

}