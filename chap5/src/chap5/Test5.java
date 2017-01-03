package chap5;
/*
 *  1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램
 */
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ballArr={1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int x=0; x<20; x++){
			//0<=i <8.99(int형이기에 8)
			int i= (int)(Math.random() * ballArr.length);
			int j= (int)(Math.random() * ballArr.length);
			int tmp=0;
			
			if(i!=j){
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			}	
		}
		
		for(int i=0;i<ball3.length;i++)
			ball3[i]=ballArr[i];
		//System.arraycopy(ballArr, 0, ball3, 0,3);
		
		for(int i=0; i<ball3.length; i++){
			System.out.print(ball3[i]);
		}
	}

}
