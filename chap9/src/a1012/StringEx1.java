package a1012;
/*
 * String Ŭ����
 * Ŭ���� �� �����ϰ� ���Կ����ڷ� ��ü������ ����
 * �� + �����ڸ� ����� �� �ִ� Ŭ����
 * String = String +�⺻�ڷ���
 */
public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc"; //���Կ����ڷ� ��ü����, Ŭ���������� ���Ǯ�� ������ִµ� �� ������ 
		String s2 = "abc";	//������ ���Ƽ� ������ ���� ����⺸�� �ִ��� ������ �˻��ؼ� ����µ� 
							//������ �״�� ����
		 
		if(s1 == s2)
			System.out.println("s1�� s1�� ���� ��ü��");
		else
			System.out.println("s1�� s2�� �ٸ� ��ü��");
		if(s1.equals(s2)) //�����
			System.out.println("s1�� s2�� ���� ������");
		else
			System.out.println("s1�� s2�� �ٸ� ������");
		String s3 = new String("abc"); //�������� ��ü ����
		String s4 = new String("abc"); //�������� ��ü ����
		if(s3 == s4)
			System.out.println("s3�� s4�� ���� ��ü��");
		else
			System.out.println("s3�� s4�� �ٸ� ��ü��");
		if(s3.equals(s4)) //�����
			System.out.println("s3�� s4�� ���� ������");
		else
			System.out.println("s3�� s4�� �ٸ� ������");
		//+�����ڸ� �̿��Ͽ� String ����
		String s5 = 1 + 2 + 3 + "��";
		System.out.println(s5);
		String s6 = "��ȣ" + 1 + 2 + 3 +"��";
	//	String s6 = "��ȣ" + (1 + 2 + 3) +"��"; //��ȣ6��
		System.out.println(s6);
		//�⺻���� String���� �޼��� : valueof()
		String s7 = String.valueOf(123);
		System.out.println(s7);
	}

}
