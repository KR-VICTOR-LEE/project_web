package aop_p.model;

import java.util.ArrayList;

public class FoodRes {
	ArrayList<FoodDate> list = new ArrayList<>(); 
	
	public void add() {
		
	}
}
class FoodDate{
	int tot, cnt;
	
	void add(GreenFood gf) {
		tot += gf.foodcnt;
		cnt ++;
	}

	@Override
	public String toString() {
		return "FoodDate [cnt=" + cnt + "]";
	}
	
}
