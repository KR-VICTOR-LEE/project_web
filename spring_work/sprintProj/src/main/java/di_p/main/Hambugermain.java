package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.HambugerSet;

public class Hambugermain {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/hambuger.xml");
		
		HambugerSet hp2 = context.getBean("hs1", HambugerSet.class);
		System.out.println(hp2);
	}
}
