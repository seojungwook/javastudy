package chap3;
/*
 * 단항연산자
 * 부호연산자 : +:현재의 부호를 유지 , -:현재의 부호를 변경
 * not 연산자
 * 	! : false <- true, true <- false
 */
public class OpEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -8;
		System.out.println(+x);
		System.out.println(-x);
		System.out.println(!true);
		boolean b = false;
		System.out.println(!b);
		b = !b;
		System.out.println(b);
		
	}

}
