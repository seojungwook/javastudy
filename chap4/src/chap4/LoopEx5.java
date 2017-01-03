package chap4;

/*
 * 구구단 출력 양식 변경
 */
public class LoopEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(j=2; j<=9;j++){
			for(i=2;i<=9;i++){
				System.out.print(i + " * " + j + " = " + (i*j) +"\t");
			}
			System.out.println();
		}
	}

}
