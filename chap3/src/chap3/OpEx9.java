package chap3;
/*
 * ����(�Ҵ�)������ : = 
 *  A = B; B�� ���� A�� ���� ����
 *  A : �ݵ�� ���� ������ �� �־�� �Ѵ�.(�������� �Ѵ�.)
 *      lvalue�� �ݵ�� �������� �Ѵ�.
 *  B : ����, ���, ���ͷ�, ������ �����ϴ� 
 * 		rvalue
 */
public class OpEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100 + 200;
		int a = 10, b = 20;
		
		//+=
		num += a; //num = num + a;
		System.out.println("num = " + num);
		//-=
		num -= b; 
		System.out.println("num = " + num);
		//*=
		System.out.println("num = " + (num*=2));
		// /=
		System.out.println("num = " + (num/=2));
		//num = num +(a+b)
		System.out.println("num = " + (num+=a + b));
		
	}

}
