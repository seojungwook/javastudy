package a1019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat 예제
 * 	String format(Date) : Date => 형식에 맞는 문자열로 변경
 * 	Date	parse(String)     : 형식에 맞는 문자열 => Date
 */
public class FormatEx2 {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		/*
		 * yyyy : 년도
		 * MM : 월
		 * dd : 일
		 * hh, HH : 0~11, 0~23시
		 * mm  : 분
		 * ss  : 초
		 * a   : 오전/오후
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(sdf.format(today));
		try {
			Date date = sdf.parse("2015-11-19 12:10:10 오전");
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
