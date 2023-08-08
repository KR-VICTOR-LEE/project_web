package di_p;

public class Bicycle {
	String name;
	Wheel w1, wh2, wh3;
	Basket bk;
	Handle hd;
	
	
	public Handle getHd() {
		return hd;
	}
	public void setHd(Handle hd) {
		this.hd = hd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Wheel getW1() {
		return w1;
	}
	public void setW1(Wheel w1) {
		this.w1 = w1;
	}
	public Wheel getWh2() {
		return wh2;
	}
	public void setWh2(Wheel wh2) {
		this.wh2 = wh2;
	}
	public Wheel getWh3() {
		return wh3;
	}
	public void setWh3(Wheel wh3) {
		this.wh3 = wh3;
	}
	public Basket getBk() {
		return bk;
	}
	public void setBk(Basket bk) {
		this.bk = bk;
	}
	@Override
	public String toString() {
		return "Bicycle [name=" + name + ", w1=" + w1 + ", wh2=" + wh2 + ", wh3=" + wh3 + ", bk=" + bk + ", hd=" + hd
				+ "]";
	}


	
}
