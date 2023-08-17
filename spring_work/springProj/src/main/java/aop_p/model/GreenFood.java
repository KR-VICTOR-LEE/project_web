package aop_p.model;

public class GreenFood {
	
	public String menu1, munu2;
	int price, foodcnt;
	
	public void setJum(String menu1, String menu2) {
		//foodcnt = menu1 + menu2;
	}

	@Override
	public String toString() {
		return "GreenFood [menu1=" + menu1 + ", munu2=" + munu2 + ", price=" + price + ", foodcnt=" + foodcnt + "]";
	}

	
}
