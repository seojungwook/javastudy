package a1019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * DateFormat ����
 * 	String format(Date) : Date => ���Ŀ� �´� ���ڿ��� ����
 * 	Date	parse(String)     : ���Ŀ� �´� ���ڿ� => Date
 */
public class FormatEx2 {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		/*
		 * yyyy : �⵵
		 * MM : ��
		 * dd : ��
		 * hh, HH : 0~11, 0~23��
		 * mm  : ��
		 * ss  : ��
		 * a   : ����/����
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(sdf.format(today));
		try {
			Date date = sdf.parse("2015-11-19 12:10:10 ����");
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
