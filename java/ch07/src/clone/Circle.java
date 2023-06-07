package clone;

public class Circle implements Cloneable{
	Point center; // 중심점
	int radius;
	
	Circle(int x, int y, int radius){
		center = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "중심점은 " + center +"이고, 반지름은"+radius+"입니다.";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
