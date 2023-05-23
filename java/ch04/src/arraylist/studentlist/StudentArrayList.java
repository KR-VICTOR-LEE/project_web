package arraylist.studentlist;

public class StudentArrayList {

	public static void main(String[] args) {
		Student s1 = new Student(1001, "이양파");
		Student s2 = new Student(1002, "박마늘");
		
		s1.addSubject("국어", 90);
		s1.addSubject("수학", 80);
		s1.addSubject("과학", 85);
		s1.showInfo();
		
		System.out.println("=========================================");
		
		
		
	}
}
