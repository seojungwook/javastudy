package a1008;

public class ExceptionEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		
	}

	private static void method1() {
		// TODO Auto-generated method stub
		try {
			method2();
		} catch (Exception e) {
			System.out.println("method1() ����ó��");
		}
	}

	private static void method2() throws Exception {
		// TODO Auto-generated method stub
		try {
			throw new Exception("���� ó�� �ϱ�");
		} catch (Exception e) {
			System.out.println("method2() ����ó��");
			throw e;  //���� �Ǵ�����
		}
	}

}
