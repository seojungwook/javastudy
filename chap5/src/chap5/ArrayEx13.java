package chap5;
/*
 * �迭 ����
 * 1. 1���� �迭�� ���������� ����
 * 		int[] arr;
 * 2. �迭 ��ü�� ����
 * 		arr = new int[10]; //int������ 10�� �Ҵ��ؼ� arr ���������� ������
 * 		int[] arr = new int[10];
 * 3. �迭 �ʱ�ȭ�ϱ�
 * 		(1) ÷��(index)����ϱ�
 * 			arr[0]=10;
 * 		(2) ����ÿ� �ʱ�ȭ
 * 			int [] arr = {10,20,30};
 * 		(3)	���������� �ʱ�ȭ
 * 			arr = new int[]{10,20,30};
 * 4. 2����(������)�� 1(n-1)�����迭�� ���������� �迭
 * 5. �����迭 : �������� �迭 ��ü�� ������
 * 
 * java ����������
 * 1. JVM ȯ�漳��
 * 2. ����Ʈ�ڵ� ����, �ε�
 * 3. main �޼��� ����
 * 
 * command line ���� �� �Է��ϱ�
 */
public class ArrayEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args.length);
		for(int i=0; i<args.length; i++)
			System.out.println("args[" + i + "]=" + args[i]);
		
		
	}

}
