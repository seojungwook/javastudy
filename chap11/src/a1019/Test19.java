package a1019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test19 {
	
	private static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date1 = null;
		Date date2 = null;
		try{
			date1 = sdf.parse(yyyymmdd1);
			date2 = sdf.parse(yyyymmdd2);
		} catch(ParseException e){
			return 0;
		}
		//date1.getTime() : 1970년 시작부터 date1일자까지의 시간을 밀리초로 리턴
		int daydiff = (int)(Math.abs(date1.getTime() - date2.getTime())/(1000*60*60*24));
		return daydiff;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getDayDiff("20000103","20010101"));
		System.out.println(getDayDiff("20010103","20010103"));
		System.out.println(getDayDiff("20010103","200103"));
		
	}

	
}
