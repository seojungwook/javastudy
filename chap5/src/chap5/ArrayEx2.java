package chap5;
//�迭 ���� 2 : �迭 �ʱ�ȭ
public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,0,0};
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println();
		int arr2[];
		arr2 = new int[]{10,20,30,40,50};
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
		
		arr2 = arr;
		arr2[3] = 100;
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	}
}
