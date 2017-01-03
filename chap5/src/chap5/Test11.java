package chap5;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{100, 100, 100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
				,{50, 50, 50}
		};
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		System.out.println(score.length);
		
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++){
				result[i][j]= score[i][j];
				result[i][score[i].length] += score[i][j];
				result[score.length][j]+=score[i][j];
				result[score.length][score[i].length] += score[i][j];
				
				
	/*			sum+=score[i][j];
				if(j==2) {
					result[i][3]=sum;
					sum=0;
				}
			}	
		}
		sum=0;
		for(int j=0; j<score[0].length; j++){
			for(int i=0; i<score.length; i++){
				sum+=score[i][j];
				if(i==4){
					result[5][j]=sum;
					sum=0;
				}
			}
		}*/
			}
		}
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length; j++){
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}
	}

}
