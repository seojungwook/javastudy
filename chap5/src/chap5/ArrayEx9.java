package chap5;
/*
 * 2���� �迭 ����2
 * 
 */
public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;

		int arr[][]= {{10,20},{30,40},{50,60}};
		for(int i =0;i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++)
				System.out.print
			("arr["+i+"]["+j+"]="+arr[i][j]+"\t");
			System.out.println();
		}
		//���� �հ� ���� ���� ���ϱ�
		for(int j=0; j<2;j++){
			int i=0;
			sum+= arr[i][j];
		}
		System.out.println("0���� �� : " +sum);
		sum=0;
		for(int j=0; j<2;j++){
			int i=1;
			sum+= arr[i][j];
		}
		System.out.println("1���� �� : " +sum);
		sum=0;
		for(int j=0; j<2;j++){
			int i=2;
			sum+= arr[i][j];
		}
		System.out.println("2���� �� : " +sum);
		sum=0;
		for(int i=0; i<3;i++){
			int j=0;
			sum+= arr[i][j];
		}
		System.out.println();
		System.out.println("0���� �� : " +sum);
		sum=0;
		for(int i=0; i<3;i++){
			int j=1;
			sum+= arr[i][j];
		}
		System.out.println("1���� �� : " +sum);
		
	/*	�����
	    int sum=0;
		  for(int i =0;i<arr.length;i++){
			  sum=0;
			for(int j=0; j<arr[i].length;j++)
				sum+= arr[i][j];
			System.out.println(i + "���� �� :"+sum);
		}
		System.out.println();
		System.out.println("\n���� �� ���:);
		
		 for(int j =0;j<arr[j].length;j++){
		  sum=0;
			for(int i=0; i<arr.length;i++)
				sum+= arr[i][j];
			System.out.println(j + "���� �� :"+sum);
		}*/
	}

}
