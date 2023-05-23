package arraylist.scorelist;

public class Student {

	int studentId;
	String studentName;
	Subject korean = new Subject();
	Subject math = new Subject();

	// 생성자
	

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}	
	
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	public void showInfo() {
		System.out.printf("학생 %s의 국어 성적은 %d점이고 수학 성적은 %d점 입니다. \n",
				studentName, korean.getScorePoint(), math.getScorePoint());
	}
	

}
