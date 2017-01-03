package a1019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Calendar.DAY_OF_WEEK_IN_MONTH : 해당요일이 몇번째
 * Calendar.DAY_OF_WEEK			: 요일 1-일요일
 * Date cal.getTime()
 */
public class Test14 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();

		for(int i=0; i<12; i++){
			for(int j=1; j<=cal.getActualMaximum(Calendar.DATE); j++){
			cal.set(2010,i,j);
		
		if(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2 && cal.get(Calendar.DAY_OF_WEEK)==1){
			Date date = cal.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 2번째 일요일입니다.");
			System.out.println(sdf.format(date));
			//	System.out.println((i+1)+" "+ j);	
			
		}
	}
}
	
}

}
