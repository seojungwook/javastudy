package chap5;
/*
 * 2���� �迭 ���� : ������ �迭�� �迭�� �迭
 * 2���� �迭 : 1���� �迭�� ���������� �迭
 * 3���� �迭 : 2���� �迭�� ���������� �迭
 * ...
 * n���� �迭 : n-1���� �迭�� ���������� �迭
 */
public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 2���� �迭�� ����
		int[] arr[];
		//2. 2���� �迭�� ����
		arr = new int[2][3];
		arr[0][0] = 10; arr[0][1]= 20; arr[0][2]= 30;
		arr[1][0] = 40; arr[1][1]= 50; arr[1][2]= 60;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.println
				("arr[" + i + "]["+j+"]="+arr[i][j]);
		}
		System.out.println();
		//length 5�� �ٲ�
		arr[1]= new int[]{100,200,300,400,500};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.println
				("arr[" + i + "]["+j+"]="+arr[i][j]);
		
		}
		
		int[][] arr2 = {{10,20,30},{40,50,60}};
		
//		int[][] arr2 = null;
//		arr2 = new int[][]{{10,20,30},{40,50,60}};
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++)
				System.out.println
				("arr2[" + i + "]["+j+"]="+arr2[i][j]);
		
		}
	
	}
}
