package objects.clone;

public class CloneTest2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(2, 3, 4);
		
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
	}

}
