package a1008;
/*
 * finally : �������̰ų�, ���ܹ߻��� ��� ����Ǵ� ��
 * 			�߰��� return ������ ������ �� ����Ǵ� ����(���� ������ ���� �����ض��)
 * ���� : 145
 * 2/0 : 1345
 */
public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print(1);
			System.out.print(2/0);
		//	return;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(3);
			return;
		} finally {
			System.out.print(4);
		}
		System.out.print(5);
	}

}
