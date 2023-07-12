package innerclass;

class Student{
	
	String name;
	
	Student(String name) {
		this.name = name;
	}
	
	class Score{
		int eng;
		int math;
		
		void showInfo() {
			System.out.println("이름 : " + name);
			System.out.println("영어 점수: " + eng);
			System.out.println("수학 점수: " + math);
		}
	}
}

public class StudentTest {

	public static void main(String[] args) {

		Student lee = new Student("이순신");
		
		Student.Score score = lee.new Score();
		score.eng = 80;
		score.math = 90;
		score.showInfo();
	}

}
