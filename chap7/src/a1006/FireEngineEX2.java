package a1006;
/*
 * ClassCastExpeption : ���������� ��ü�� ���迡 ���� �߻��� �߻��Ǵ� ����
 * 
 * �ڼ�Ÿ���� ��ü�� �θ�Ÿ���� ���������� ���� ����(o)
 * => ��� Ŭ������ ��ü�� ObjectŸ������ ����ȯ�� �����ϴ�.
 * �θ�Ÿ���� ��ü�� �ڼ�Ÿ���� ���������� ���� �Ұ�
 * 
 */
public class FireEngineEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new FireEngine();
		FireEngine fe = null;
		car.driver();
//		fe = (FireEngine)car; // ClassCastExpeption �߻�
//		fe.driver();
		Object o = car;
		o = new String("abc");
		//instanceof ������ : ���������� ��ü���� ����
		//����� true�� ��� �ش簴ü�� �ش��������������� ������ �����ϴ�.
		if (car instanceof FireEngine)
			System.out.println("car ���������� �����ϴ� ��ü�� FireEngine ��ü��");
		if (car instanceof Car)
			System.out.println("car ���������� �����ϴ� ��ü�� Car ��ü��");
		if (car instanceof Object)
			System.out.println("car ���������� �����ϴ� ��ü�� Object ��ü��");
	}
}
