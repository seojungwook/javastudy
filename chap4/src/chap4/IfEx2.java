package chap4;
/*
 * if, else if ����
 * 
 * ���ǽ��� �ݵ�� ����� boolean�̾�� �Ѵ�.
 */

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//90�� �̻��̸� A ... 60�̸��̸� F ���
		int score = 90;
		if(score>=90) 
			System.out.println("A����");
		else if(score>=80)
			System.out.println("B����");
		else if(score>=70)
			System.out.println("C����");
		else if(score>=60)
			System.out.println("D����");
		else 
			System.out.println("F����");
		
		//������ ���ڸ� �Է¹޾Ƽ� �빮�ڸ� �빮���Դϴ�.
		//�ҹ��ڸ� �ҹ����Դϴ�.
		//���ڸ� �����Դϴ�.
		//�� ���� ���ڸ� ��Ÿ�����Դϴ�. ���
		System.out.println("�����Է�");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		System.out.print(ch + "�� ");
		
		if(ch>= 'A' && ch<='Z')
			System.out.println("�빮���Դϴ�");
		else if(ch>='a' && ch<='z')
			System.out.println("�ҹ����Դϴ�");
		else if(ch>='0' && ch<='9')
			System.out.println("�����Դϴ�");
		else
			System.out.println("��Ÿ�����Դϴ�");
		
	}

}
