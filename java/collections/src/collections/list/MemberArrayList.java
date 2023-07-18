package collections.list;

import java.util.ArrayList;

import collections.member.Member;

//Member 클래스를 관리하는 클래스(CRUD)
public class MemberArrayList {
	//ArrayList 객체 선언
	ArrayList<Member> arrayList;
	
	//생성자
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 생성 매서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 목록 보기 매서드
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원 1명 보기
	public void showOne(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			int dbId = arrayList.get(i).getMemberId();  //이미 저장된 memberId에 변수 할당
			if(memberId == dbId) { //외부에 입력한 아이디와 같으면
				Member member = arrayList.get(i);  //membr 객체 생성(할당)
				System.out.println(member);
			}
		}
	}
	// 회원 삭제 메서드
	private void removeMember(int mamberId) {
		for(int i=0; i<arrayList.size(); i++) {
			int dbId = arrayList.get(i).getMemberId();
			if(mamberId == dbId) {
				
			}
		}
	}
	
}
