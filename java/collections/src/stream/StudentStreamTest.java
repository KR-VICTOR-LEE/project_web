package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		// Arrays
		List<Student> list = Arrays.asList(new Student("테스트", 90), new Student("테스트1", 95), new Student("테스트2", 100));
		// 전체 조회(for)
		for (Student std : list)
			System.out.println(std.getName() + ", " + std.getScore());
		System.out.println("====================================");

		// Stream과 람다식으로 출력
		Stream<Student> stream = list.stream();
		/*
		 * stream.forEach(student ->{ String name = student.getName(); int score =
		 * student.getScore(); System.out.println(name + ", " + score); });
		 */
		stream.forEach(student -> System.out.println(student.getName() + ", " + student.getScore()));
	}
}