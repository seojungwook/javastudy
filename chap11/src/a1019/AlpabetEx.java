package a1019;

import java.util.Random;

/*
 * Random Ŭ������ �̿��Ͽ� ���ĺ� �빮�ڵ� �� 
 * �������� �����Ͽ� ������ ���� ����ϱ�
 * [���]
 * G K O P W
 * R V T S K
 * Z O P U T
 */
public class AlpabetEx {
	public static void main(String[] args) {
		char c= 0;
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
			for(int j = 0; j<3; j++){
				for(int i = 0; i<5; i++){
					c = (char)(r.nextInt(26)+65);
				System.out.print(c+ " ");
				}
			System.out.println();
			}
		}
}
