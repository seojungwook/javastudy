package chap6;
/*
 * 180p 181p �ʱ� ��
 * ����Լ� ���� : ���ÿ����� �����ϹǷ� ����Լ� ����;
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
