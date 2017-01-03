package a1016;

import java.util.Calendar;

/*
 * Calendar 클래스 : 추상클래스임
 * 	객체생성을 위해 getInstance() 메서드를 사용
 */
public class CalendarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today= Calendar.getInstance();
		System.out.println("올해년도:"+ today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월)"+ (today.get(Calendar.MONTH)+1));
		System.out.println("올해 몇째주"+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달 몇째주"+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달 일자"+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이달 일자"+today.get(Calendar.DATE));
		System.out.println("올해 몇번째일자"+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일)"+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("오전(0) 오후(1)"+today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) "+today.get(Calendar.HOUR));
		System.out.println("시간(0~23) "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분"+today.get(Calendar.MINUTE));
		System.out.println("초"+today.get(Calendar.SECOND));
		System.out.println("밀리초"+today.get(Calendar.MILLISECOND));
		//today.get(Calendar.ZONE_OFFSET) 
		//시간대를 밀리세크로 리턴
		System.out.println("TimeZone :"+today.get(Calendar.ZONE_OFFSET)/(60*60*1000)); // 영국이랑 시간 차이
		System.out.println("이달의 마지막일자"+today.getActualMaximum(Calendar.DATE));
	}

}
