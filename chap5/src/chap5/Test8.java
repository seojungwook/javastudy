package chap5;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		/*
		 * counter[0] : 1의 개수 
		 * counter[1] : 2의 개수 
		 * counter[2] : 3의 개수 
		 * counter[3] : 4의 개수 
		 * 
		 */
		int[] counter = new int[4];
		
		for(int i=0;i<answer.length;i++){
			counter[answer[i]-1]++;
		}

		for(int i=0;i<counter.length;i++){
			System.out.print((i+1)+"개수 : " +counter[i]);
			for(int j=0; j<counter[i];j++){
				System.out.print('*');
					
			}
			System.out.println();
			
		}
	}
}

