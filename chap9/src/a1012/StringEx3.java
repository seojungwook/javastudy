package a1012;
/*
 * String, StringBuffer ����
 * ����,  ����
 * equals �޼��尡 �������̵� �����ʾ���.
 */
public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "base";
	//	System.out.println(str.replace('e', 'k').concat("et")); //basket
		System.out.println(str =str.replace('e', 'k').concat("et")); //str= ��������
		str += "ball";
		System.out.println(str);
		//���� baseball => basketball�� ����ǵ���
		
		
		StringBuffer sb = new StringBuffer("base");
		System.out.println(sb.replace(3, 4, "k").append("et"));
		sb.append("ball");
		System.out.println(sb);
	}

}
