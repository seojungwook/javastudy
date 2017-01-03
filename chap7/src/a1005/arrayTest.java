package a1005;

/*
 * 자습문제 : 
 * 		int arr1[] = {50,7,5,8,1,33,16,2,28,25,29,17,44,13,9,31,41};
 */
public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {50,7,5,8,1,33,16,2,28,25,29,17,44,13,9,31,41};
	
		
		int[][] matrix = new int[5][5];
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr1.length-1-i; j++){
				if(arr1[j]<arr1[j+1]){
				int temp = arr1[j];
				arr1[j] = arr1[j+1];
				arr1[j+1] = temp;
				}
			}
		}
		
		int cnt=0;
		for(int i=0; i<matrix.length / 2+1; i++){
			for(int j = i; j<matrix.length -i; j++){
				matrix[i][j]= arr1[cnt++];
			}
				
		}
		
		for(int i = matrix.length /2+1; i<matrix.length;i++){
			for(int j = matrix.length-(i+1); j<=i; j++){
				matrix[i][j] = arr1[cnt++];
			}
		}
		
		for(int i=0;i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++)
				System.out.print(((matrix[i][j]!=0)?matrix[i][j]:"  ")+ "\t");
				System.out.println();
			
		}

	
			
	}
}

	


