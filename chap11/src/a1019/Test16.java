package a1019;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Test16 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("##,###.#");
		DecimalFormat df2 = new DecimalFormat("#,####");
		String data = "123,456,789.5";
		System.out.println("data:" + data);
		Number num = df.parse(data);
		System.out.println("�ݿø�:"+ Math.round((Double)num));
		System.out.println("������:" + df2.format(num));
		
	}

}
