package chap5;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{5, 5, 5, 5, 5,},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		
		int total = 0;
		float average =0; 
	
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				total+= arr[i][j];
				
			}
		}
		average=(float)total/(arr[0].length + arr[1].length + arr[2].length +arr[3].length);
		
		System.out.println("total="+ total);
		System.out.println("average=" + String.format("%.2f",average));
	}

}
