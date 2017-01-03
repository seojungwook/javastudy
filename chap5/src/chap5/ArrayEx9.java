package chap5;
/*
 * 2차원 배열 예제2
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
		//행의 합과 열의 합을 구하기
		for(int j=0; j<2;j++){
			int i=0;
			sum+= arr[i][j];
		}
		System.out.println("0행의 합 : " +sum);
		sum=0;
		for(int j=0; j<2;j++){
			int i=1;
			sum+= arr[i][j];
		}
		System.out.println("1행의 합 : " +sum);
		sum=0;
		for(int j=0; j<2;j++){
			int i=2;
			sum+= arr[i][j];
		}
		System.out.println("2행의 합 : " +sum);
		sum=0;
		for(int i=0; i<3;i++){
			int j=0;
			sum+= arr[i][j];
		}
		System.out.println();
		System.out.println("0열의 합 : " +sum);
		sum=0;
		for(int i=0; i<3;i++){
			int j=1;
			sum+= arr[i][j];
		}
		System.out.println("1열의 합 : " +sum);
		
	/*	강사님
	    int sum=0;
		  for(int i =0;i<arr.length;i++){
			  sum=0;
			for(int j=0; j<arr[i].length;j++)
				sum+= arr[i][j];
			System.out.println(i + "행의 합 :"+sum);
		}
		System.out.println();
		System.out.println("\n열의 합 출력:);
		
		 for(int j =0;j<arr[j].length;j++){
		  sum=0;
			for(int i=0; i<arr.length;i++)
				sum+= arr[i][j];
			System.out.println(j + "열의 합 :"+sum);
		}*/
	}

}
