package chap3;
/* ���׿����� : �ǿ����ڰ� �Ѱ��� ���
 *  ���������� ���� : ++ : 1�� ����, -- : 1�� ����
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
