package a1008;
/*
 * throws : try ���� �̿��� �� �ٸ� ����ó��
 * 			���� ȣ���� �޼��忡 ���� ����( ���� ȣ���� ������ ���� )
 * 			cf. main ȣ���� JVM
 */
public class ExceptionEx6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method1();
	}

	private static void method1() throws Exception{
		// TODO Auto-generated method stub
		method2();
	}

	private static void method2() throws Exception {
		throw new Exception("throws�� ����ó���ϱ�");
	}
}
