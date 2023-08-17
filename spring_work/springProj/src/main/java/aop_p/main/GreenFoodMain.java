package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.model.GreenFood;

public class GreenFoodMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/food.xml");
		
		GreenFood gf = context.getBean("greenFood", GreenFood.class);
		
		
		
	}

}
