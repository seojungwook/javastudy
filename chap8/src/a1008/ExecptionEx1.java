package a1008;
/*
 * ����ó�� : �߻��� ���ܸ� ����
 * 	try catch ����
 * 		try �� : ���ܹ߻��� �� �ִ� ����
 * 		catch �� : ����ó�� ����( ���ܰ� �߻����� �ʴ´ٸ� �� ���� ������� �ʾ�)
 * 
 * �⺻������ �ڹٿ����� ����ó���� �ʼ���.
 * �� RuntimeException�� ���� ����ó�� ������ ����
 */
public class ExecptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(1);
		try{ // try��
	//	System.out.print(2/0); //ArithmeticException ���ܰ�ü �߻�
		System.out.print(2); //���ܰ�ü �߻����� ������ 1235.
		System.out.print(3);
		} catch (ArithmeticException e){
		System.out.print(4);
		}
		System.out.print(5);
		System.out.println();
	}

}
