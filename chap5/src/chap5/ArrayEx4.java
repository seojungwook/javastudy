package chap5;

import java.util.Set;
import java.util.TreeSet;

//�ζǹ�ȣ ������
public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ball[] = new int[45];
		for(int i=0; i<ball.length;i++)
			ball[i] = i+1;
		for(int i=0; i<10000;i++){
			int index = (int)(Math.random()*45);
			int temp = ball[0];
			ball[0] = ball[index];
			ball[index] = temp;
		}
		System.out.print("�ζ� ��ȣ : ");
		int lotto[] = new int[6];
		for(int i=0; i<lotto.length;i++){
			lotto[i] = ball[i];
			System.out.print(lotto[i]+"," );
		}
		System.out.println();
		System.out.print("���� �� : ");
		for(int i=0; i<lotto.length; i++){
			for(int j=0; j<lotto.length-1-i; j++){
				if(lotto[j]>lotto[j+1]){
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		/*
		 * : ������ for���� : ÷�� ���Ұ�
		 * 				 �迭, collection ��ü ��밡��
		 *
		 * for(int num : lotto) 
		 * 		System.out.print(num + ",");
		 * for(int i=0; i<lotto.length;i++)
		 * 		System.out.print(lotto[i] + ",");�� �ǹ̿� ����.
		 */
		for(int num : lotto)
			System.out.print(num + ",");
		System.out.println();
	}
	

}
