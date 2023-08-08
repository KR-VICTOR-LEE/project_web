package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Camera;
import di_p.HandPhone;
import di_p.interBiCycle;

public class BiCycle_main2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/bicycle2.xml");

		
		for (String str : "bc1,bc2,bc3".split(",")) {
			interBiCycle bc = context.getBean(str,interBiCycle.class);
			System.out.println(bc);
		}
		
	}

}
