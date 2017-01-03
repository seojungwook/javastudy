package chap6;
/*
 * 180p 181p 필기 봐
 * 재귀함수 예제 : 스택영역이 존재하므로 재귀함수 가능;
 */
public class FactorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				new FactorialEx().factorial(4));
	}

	private int factorial(int i) {
		// TODO Auto-generated method stub
		return (i==1)?1:i*factorial(i-1);
	}

}
