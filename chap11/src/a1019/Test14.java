package a1019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Calendar.DAY_OF_WEEK_IN_MONTH : �ش������ ���°
 * Calendar.DAY_OF_WEEK			: ���� 1-�Ͽ���
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
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd�� 2��° �Ͽ����Դϴ�.");
			System.out.println(sdf.format(date));
			//	System.out.println((i+1)+" "+ j);	
			
		}
	}
}
	
}

}
