package a1019;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test15 {
static int paycheckCount(Calendar from, Calendar to){
	if(from == null || to == null) return 0;
	if(from.equals(to)&&from.get(Calendar.DATE)==21)
		return 1;
	int monDiff = (to.get(Calendar.MONTH)+1) - (from.get(Calendar.MONTH)+1);
	monDiff += (to.get(Calendar.YEAR)- from.get(Calendar.YEAR))*12;
	if(monDiff<0) return 0;
	if(from.get(Calendar.DATE)<=21 && to.get(Calendar.DATE)>=21)
		monDiff++;
		if(from.get(Calendar.DATE)>21 && to.get(Calendar.DATE)<21)
		monDiff--;
	return monDiff;
}

static void printResult(Calendar from, Calendar to){
	Date fromDate = from.getTime();
	Date toDate = to.getTime();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	System.out.print(sdf.format(fromDate) + "~" + sdf.format(toDate) + ":");
	System.out.println(paycheckCount(from, to));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2010, 0,1);
		toCal.set(2010, 0, 1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010, 0, 21);
		toCal.set(2010, 0, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 23);
		printResult(fromCal, toCal);
		
		fromCal.set(2010, 0, 23);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2011, 0, 22);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);
	}

}
