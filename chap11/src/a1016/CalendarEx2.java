package a1016;

import java.util.Calendar;

/*
 * Calendar ����. ��¥ �����ϱ�
 */
public class CalendarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 10, 16, 14, 30, 30); //2015.11.15
		int tday = today.get(Calendar.DAY_OF_YEAR);
		int cday = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("��¥�� ���� :"+ (cday - tday));
		//���� : 2015�� 11�� 16�� ������������ ���
		int dday = cal.get(Calendar.DAY_OF_WEEK);

		String[] d = {"��","��", "ȭ", "��", "��","��","��"};
		System.out.println(d[dday-1] +"����");
		System.out.println(d[cal.get(Calendar.DAY_OF_WEEK)-1]);
		
//		switch(dday){
//		case 1 : System.out.println("�Ͽ���"); break;
//		case 2 : System.out.println("������"); break;
//		case 3 : System.out.println("ȭ����"); break;
//		case 4 : System.out.println("������"); break;
//		case 5 : System.out.println("�����"); break;
//		case 6 : System.out.println("�ݿ���"); break;
//		case 7 : System.out.println("�����"); break;
//		}
	}

}
