package datetime;

import java.util.Calendar;

public class PassedTime {

	public static void main(String[] args) {
		Calendar theDay = Calendar.getInstance();  //시작일 객체 생성
		Calendar today = Calendar.getInstance();   //현재일 객체 생성
		
		theDay.set(2023, 3, 16); //시작일 지정
		today.set(2023, 5, 24);  //현재일 지정
		
		//System.out.println(startDay.get(Calendar.YEAR)); //2023
		
		/*String startDay = theDay.get(Calendar.YEAR) + "년 " + 
				theDay.get(Calendar.MONTH) + "월 " + theDay.get(Calendar.DATE) + "일";
		
		String today1 = today.get(Calendar.YEAR) + "년 " + 
				today.get(Calendar.MONTH) + "월 " + today.get(Calendar.DATE) + "일";
		
		System.out.println("시작일 - " + startDay);
		System.out.println("오늘 - " + today1);*/
		
		//datePrint() 함수 호출
		System.out.println("시작일 - " + datePrint(theDay));
		System.out.println("시작일 - " + datePrint(today));
		
		//현재 까지의 시간 (일로 환산)
		//System.out.println(today.getTimeInMillis() / (24*60*60*1000));
		
		//지나온 시간 계산하기
		long passedTime = today.getTimeInMillis() - theDay.getTimeInMillis();
		passedTime = passedTime / (24*60*60*1000);
		System.out.println("개강 이후 " + passedTime + "일이 지났습니다.");
	}
	
	public static String datePrint(Calendar date) {
		String date2 = date.get(Calendar.YEAR) + "년 " + 
				date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
		
		return date2;
	}

}
