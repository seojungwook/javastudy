package chap3;
/* 단항연산자 : 피연산자가 한개인 경우
 *  증감연산자 예제 : ++ : 1씩 증가, -- : 1씩 감소
 *  
 */
public class OpEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		x++;
		System.out.println("x=" + x);
		x--;
		System.out.println("x=" + x);
		int y = x++;
		System.out.println("x=" + x + ", y=" + y);
		y = x--;
		System.out.println("x=" + x + ", y=" + y);
		y = ++x;
		System.out.println("x=" + x + ", y=" + y);
		y = --x;
		System.out.println("x=" + x + ", y=" + y);
		System.out.println("x=" + x++);
		System.out.println("x=" + ++x);
		System.out.println("x=" + --x);
		
	}

}
