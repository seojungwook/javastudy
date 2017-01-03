package a1019;

import java.text.DecimalFormat;
import java.text.ParseException;

/*
 * DecimalFormat 예제
 * 	String format(Number)	: 숫자 => 형식에 맞는 문자열 변경
 * 	Number parse(String)	: 형식에 맞는 문자열 => 숫자
 */
public class FormatEx1 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		try {
			Number num = df.parse("1,234,567.89"); //문자열을 숫자로(parse)
			double d = num.doubleValue();
			System.out.print(d + "->");
			System.out.println(df2.format(num));
			} catch (Exception e){
				e.printStackTrace();
			}
		//12345 숫자를 세자리마다 ,로 구분하기
		String s = df.format(12345);
		System.out.println(s);
		System.out.printf("%,d\n",12345); //jdk5.0 이후
		System.out.println(String.format("%,d",12345)); //jdk5.0 이후
		//12,345을 숫자로 인식하기
		try {
			long num = (Long)df.parse(s);
			System.out.println(num + 1000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
