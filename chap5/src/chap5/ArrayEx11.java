package chap5;
/*
 *�����迭 ����
 *1. ������ �迭������ ������.
 *2. n-1������ ���� ���� �� �ִ�
 * 
 */
public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] arr= new int[3][];
			arr[0]=new int[]{10,20,30};
			arr[1]=new int[]{40,50};
			arr[2]=new int[]{60,70,80,90};
			for(int i=0; i<arr.length; i++){
				for(int j=0;j<arr[i].length; j++)
					System.out.print
					("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
				System.out.println();
			}
	}
}
