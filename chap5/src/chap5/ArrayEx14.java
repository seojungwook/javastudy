package chap5;

import java.util.Scanner;

/*
 * command line���� ���� ��������� ���ڸ� �Է¹޾� ��� �����ϱ�
 * ��������ڴ� +,-,x,/,%�� ���
 * Integer.parseInt("123") => ������ 123 ��ȯ��
 */
public class ArrayEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 3){
			System.out.println("�ٽ� ���� �ϼ���");
			return;
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		int result=0;
		//args[1]�� ���ؼ� ����� �����ϱ�
		
		for(String s : args)
			System.out.print(s+" ");
		System.out.print("= ");
		switch(args[1]){
			case"+":
				result=a+b; break;
			case"-":
				result=a+b; break;
			case"x":
				result=a+b; break;
			case"/":
				result=a+b; break;
			case"%":
				result=a+b; break;
		}
		
	
		System.out.println( result);
	}

}
