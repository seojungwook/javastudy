package a1008;
/*
 * throw : ���� �߻�
 * 	try ������ ����ó��( ���� ) ����̰�, 
 * 	throw�� ���� �߻���Ű�� ����� ������.
 */
public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("���Ƿ� ���� �߻�");//���ܰ�ü �߻�
			throw e; //JVM ����
		} catch(Exception e){
			System.out.println("���ܸ޽��� : "+ e.getMessage());
			// ���� �߻� ��� ���
			e. printStackTrace();
		}
		
		System.out.println("���α׷� ���� ����");
	}

}
