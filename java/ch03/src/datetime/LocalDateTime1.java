package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime1 {

	public static void main(String[] args) {
		// LocalDate - 날짜, LocalTime-시간, LocalDateTime - 날짜와 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yy-mm-dd hh:mm:ss a");
		String current_time = now.format(datetime);
		System.out.println(current_time);
	}

}
