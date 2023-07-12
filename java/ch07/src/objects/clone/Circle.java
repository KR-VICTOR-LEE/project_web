package objects.clone;

public class Circle implements Cloneable{
	Point center;
	int radius;
	
	Circle(int x, int y, int radius){
		center = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "중심점은 " + center + " 이고, 반지름은 " + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
