package arraylist;

import java.util.ArrayList;
import arrayobject.Book;

public class BookArrayList {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		
		Book book1 = new Book("혼자 공부하는 Java", "신용권");
		Book book2 = new Book("반응형 웹 프로젝트", "김은아");
		Book book3 = new Book("tiny project", "켄 유엔스-클락");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		//bookList의 크기
		System.out.println(bookList.size());
		
		//1개 요소 가져오기
		System.out.println(bookList.get(0));
		bookList.get(0).showInfo();
		
		System.out.println("===============================");
		
		//전체 요소 조회
		for(int i=0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			book.showInfo();
		}
		
		//요소 삭제하기
		if(bookList.contains(book3)) {
			bookList.remove(book3);
		}
		
		System.out.println("===============================");
		
		//향상 for
		for(Book book : bookList)
			book.showInfo();
	}

}
