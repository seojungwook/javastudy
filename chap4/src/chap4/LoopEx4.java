package chap4;
/*
 *  중첩 반복문 : 반복문 내에 반복문이 존재함
 *  break : break가 속한 반복문, switch을 벗어남
 *  continue : continue가 속한 반복문의 끝으로 제어를 이동
 */
public class LoopEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=2; i<=9; i++){
			System.out.println("\n" + i + "단");
			for(j=2; j<=9;j++){
				//if(j==5)break;
				if(j==5) continue;
				System.out.println(i + " * " + j + " = " + (i*j));
				
			}
		}
	}
}
