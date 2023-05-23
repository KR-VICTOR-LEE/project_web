package arraylist.studentlist;

import java.util.ArrayList;
import arraylist.Subject;

public class Student {
	int studentId;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	//과목 추가 메서드
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //과목 객체 생성
		subject.setSubjectName(name);
		subject.setScorePoint(score);		
		subjectList.add(subject);  //어레이리스트에 추가
	}
	
	//학생 정보 출력 메서드
	public void showInfo() {
		int sumV = 0;  //총점
		double avg;    //평균
		
		//정보 출력
		for(int i=0; i<subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			sumV += subject.getScorePoint();  //점수 합계
			
			System.out.printf("학생 %s의 %s 과목 성적은 %d점입니다.\n", 
					studentName, subject.getSubjectName(), subject.getScorePoint());
		}
		avg = (double)sumV / subjectList.size();  //평균
		System.out.printf("학생 %s의 과목 총점은 %d점이고, 과목 평균은 %.1f점입니다.\n", 
				studentName, sumV, avg);
	}
}
