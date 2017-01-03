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
			System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է����ּ���" );
			System.out.print(">>");
			String input = scan.next();
			try{
				date = sdf.parse(input);
			}catch (ParseException e){
				// input�� ���� sdf�� ������ ������ �ƴϴ�.
				continue;
			}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String week[] = { "", "��", "��", "ȭ", "��", "��", "��","��"};
		
		System.out.println("�Է��Ͻ� ��¥��"+ week[cal.get(Calendar.DAY_OF_WEEK)]+ "�����Դϴ�");
		}
	}

}
