package chap5;
//�迭 ���� 1

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. �迭�� ���� : �������� ����
	//	int arr[];
		//2. �迭�� ���� : �迭 ��ü ����
	//	arr = new int[5];
		//1 + 2
		int arr[] = new int[5];
		
		/*
		 * new�� ���
		 * 1. �޸� �Ҵ�
		 * 2.�� ����  �⺻������ �ʱ�ȭ
		 * 		���� : 0
		 * 		���� : null
		 * 		boolean : false 
		 */
		//3. �迭�� ���
		arr[0] =10;
		arr[1] = 20;
		arr[2] = arr[0] + arr[1];
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}

}
