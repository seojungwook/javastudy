package a1016;

import java.util.Calendar;

/*
 * Calendar 예제. 날짜 선정하기
 */
public class CalendarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 10, 16, 14, 30, 30); //2015.11.15
		int tday = today.get(Calendar.DAY_OF_YEAR);
		int cday = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("날짜의 차이 :"+ (cday - tday));
		//문제 : 2015년 11월 16일 무슨요일인지 출력
		int dday = cal.get(Calendar.DAY_OF_WEEK);

		String[] d = {"일","월", "화", "수", "목","금","토"};
		System.out.println(d[dday-1] +"요일");
		System.out.println(d[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
//		switch(dday){
//		case 1 : System.out.println("일요일"); break;
//		case 2 : System.out.println("월요일"); break;
//		case 3 : System.out.println("화요일"); break;
//		case 4 : System.out.println("수요일"); break;
//		case 5 : System.out.println("목요일"); break;
//		case 6 : System.out.println("금요일"); break;
//		case 7 : System.out.println("토요일"); break;
//		}
	}

}
