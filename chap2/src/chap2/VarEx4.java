package chap2;
//char �� int ���� ����ȯ

public class VarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		int i = c;
		System.out.println("c=" + c);
		System.out.println("i=" + i);
		int i2 = 'A' + 1;
		System.out.println("i2=" + i2);
		char c2 = (char)i2;
		System.out.println("c2=" + c2);
		
//���� �ٸ� �ڷ����� ������ ����� ū �ڷ������̴�.		
//int ������ ���� �ڷ����� ������ ����� int���̴�.
		char c3 = (char) (c2 + 1); //����� ����ȯ
		System.out.println("c3=" + c3);
	}

}
