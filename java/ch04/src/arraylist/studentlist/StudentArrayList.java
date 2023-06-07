package arraylist.studentlist;

public class StudentArrayList {

	public static void main(String[] args) {
		Student s1 = new Student(1001, "이양파");
		Student s2 = new Student(1002, "박마늘");
		
		s1.addSubject("국어", 90);
		s1.addSubject("수학", 82);
		s1.addSubject("Java", 85);
		s1.showInfo();
		
		System.out.println("==================================================");
		
		s2.addSubject("국어", 88);
		s2.addSubject("수학", 70);
		s2.addSubject("Java", 75);
		s2.showInfo();
	}
}
