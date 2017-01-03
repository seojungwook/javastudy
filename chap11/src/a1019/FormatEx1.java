package a1019;

import java.text.DecimalFormat;
import java.text.ParseException;

/*
 * DecimalFormat ����
 * 	String format(Number)	: ���� => ���Ŀ� �´� ���ڿ� ����
 * 	Number parse(String)	: ���Ŀ� �´� ���ڿ� => ����
 */
public class FormatEx1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		try {
			Number num = df.parse("1,234,567.89"); //���ڿ��� ���ڷ�(parse)
			double d = num.doubleValue();
			System.out.print(d + "->");
			System.out.println(df2.format(num));
			} catch (Exception e){
				e.printStackTrace();
			}
		//12345 ���ڸ� ���ڸ����� ,�� �����ϱ�
		String s = df.format(12345);
		System.out.println(s);
		System.out.printf("%,d\n",12345); //jdk5.0 ����
		System.out.println(String.format("%,d",12345)); //jdk5.0 ����
		//12,345�� ���ڷ� �ν��ϱ�
		try {
			long num = (Long)df.parse(s);
			System.out.println(num + 1000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
