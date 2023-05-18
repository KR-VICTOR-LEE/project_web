package datetime;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		//날짜와 시간 객체 생성
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getCalendarType());
		
		//날짜
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;  //배열 인덱스 0 - 1월
		// 월이 10 미만이면 0을 포함하여 두자리 문자로 표기하며 아니면 그대로 표기함 
		String strMonth = (month < 10) ? ("0" + month) : ("" + month);
		int date = cal.get(Calendar.DATE);
		String strdate = (date < 10) ? ("0" + date) : ("" + date);
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		// 시간
		int hour = cal.get(Calendar.HOUR);
		String strhour = (hour < 10) ? ("0" + hour) : ("" + hour);
		int minute = cal.get(Calendar.MINUTE);
		String strminute = (minute < 10) ? ("0" + minute) : ("" + minute);
		int second = cal.get(Calendar.SECOND);
		String strsecond = (second < 10) ? ("0" + second) : ("" + second);
		
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		// 요일 : 0-일, 1-월, 2-화, 3-수, 4-목, 5-금, 6-토
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d년 %s월 %s일\n", year, strMonth, strdate);
		System.out.printf("%d시 %s분 %s초\n", hour, strminute, strsecond);
		
		System.out.println(day);
		
		// 요일 출력
		String[] days = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 "+ days[day-1]+"요일 입니다.");
	}
}
