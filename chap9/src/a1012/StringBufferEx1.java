package a1012;
/*390p
 * 
 * StringBuffer Ŭ����
 * ������ ���ڿ� ��ü
 * equals �޼��尡 �������̵� �����ʾ���.
 * => ����񱳸� ���ؼ��� toString()�޼��带 ����Ͽ� 
 * String���� ���� �� equals �޼��带 ����ؾ��Ѵ�.
 * 
 */
public class StringBufferEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		if(sb1==sb2)
			System.out.println("sb1�� sb2�� ���� ��ü");
		else 
			System.out.println("sb1�� sb2�� �ٸ� ��ü");
		if(sb1.equals(sb2)) 
			System.out.println("sb1�� sb2�� ���� ����");
		else
			System.out.println("sb1�� sb2�� �ٸ� ����");
		if(sb1.toString().equals(sb2.toString())) //���ڷ� ������ ����
			System.out.println("sb1�� sb2�� ���� ����");
		else
			System.out.println("sb1�� sb2�� �ٸ� ����");
	}

}
