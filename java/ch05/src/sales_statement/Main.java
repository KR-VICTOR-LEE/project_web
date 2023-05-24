package sales_statement;

import java.io.ByteArrayInputStream;

public class Main {

	public static void main(String[] args) {
		Drink coffee = new Drink("커피", 2500, 10);
		Drink tea = new Drink("녹차", 3000, 4);
		
		// Alcohol 객체 생성 
		Alcohol soju = new Alcohol("소주", 4000, 5,16);
		
		Drink.printTitle(); //클래스 이름으로 접근	
		coffee.printData();
		tea.printData();
		
		System.out.println();
		
		Alcohol.printTitle();
		soju.printData();
		
		// 총 판매금액
		int total = coffee.getoTotalPrice() + tea.getoTotalPrice() + soju.getoTotalPrice();
		
		
		System.out.println();
		System.out.printf("\n*** 합계 금액 : %d원 ***", total);
	}

}
