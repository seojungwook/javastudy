package chap3;

import java.util.Scanner;

/*
 * Ű����κ��� �ʸ� �Է¹޾� ��ð� ��� ���ʿ� �ش��ϴ��� ����ϱ�
 * 3751�� : 1�ð� 2�� 31�� ���
 */
public class OpEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�ð��Է� : ");
		//System.in : ǥ���Է°�ü
		//			  Ű���忡�� �Էµ� ������ ����
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int h = num/3600;
		int m = (num%3600)/60;
		int s = num%60;
	
		System.out.println(h +"�ð�" + m + "��"+ s+"��" );
	}

}
