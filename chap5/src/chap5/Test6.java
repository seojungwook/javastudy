package chap5;
/*
 * �Ž������� �� ���� �������� ������ �� �ִ��� ����ϴ� ����
 * ���� money�� �ݾ��� �������� �ٲپ��� �� ���� ��� ������ �ʿ����� ����ؼ� ���
 * ��, ������ �� ���� ���� �������� �Ž��� �־�� �Ѵ�.
 * 
 */
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2780;
		System.out.println("money=" + money);
		
		for(int i=0; i<coinUnit.length;i++){
		/*	int num= money;
			num/=coinUnit[i];
			money%=coinUnit[i];
			System.out.println(coinUnit[i]+"�� : "+ num);*/
			
			System.out.println(coinUnit[i]+"�� : "+money/coinUnit[i]);
			money%=coinUnit[i];
		}
	}

}
