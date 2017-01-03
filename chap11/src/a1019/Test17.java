package a1019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		while(true){
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요" );
			System.out.print(">>");
			String input = scan.next();
			try{
				date = sdf.parse(input);
			}catch (ParseException e){
				// input의 값이 sdf가 지정한 형식이 아니다.
				continue;
			}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String week[] = { "", "일", "월", "화", "수", "목", "금","토"};
		
		System.out.println("입력하신 날짜는"+ week[cal.get(Calendar.DAY_OF_WEEK)]+ "요일입니다");
		}
	}

}
