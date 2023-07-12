package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonTest {

	public static void main(String[] args) {
		//직렬화
		Person son = new Person("손정의", "대표이사");
		Person jang = new Person("장그래", "부장");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(son);
				oos.writeObject(jang);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//역직렬화 - 복원
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
