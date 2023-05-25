package db;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		// Person 자료검색
		PersonDAO dao = new PersonDAO();
		
		ArrayList<Person> personList =  dao.getPersonList();
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			
			String userId = person.getUserId();
			String userPw = person.getUserPw();
			String name = person.getName();
			int age = person.getAge();
			System.out.println("아이디 : "+userId+"\n비밀번호 :"+userPw+"\n이름 : "+name+"\n나이 : "+ age);
			
		}
	}

}
