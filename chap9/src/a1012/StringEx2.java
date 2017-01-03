package a1012;
/*
 * String Ŭ������ ��� �޼���
 */
public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("ABCDEFGH");
		//charAt(4) : 4���ε���(5��°)�� ���� ����
		System.out.println(s.charAt(4));
		//compareTo() : �� ���ڿ��� ũ�� ��
		//				���Ŀ��� ���Ǵ� �޼���
		//				A - a = -32
		System.out.println(s.compareTo("abc"));
		//IgnoreCase : ��ҹ��� ���о��� ����
		System.out.println(s.compareToIgnoreCase("abcdefgh"));
		//concat : �� ���ڿ��� �����ϱ� 
		// == s + "abc"
		System.out.println(s.concat("abc"));
		//endWith : s���ڿ��� "FGH"�� ����?
		System.out.println(s.endsWith("FGH"));
		//statsWith : s���ڿ��� "ABC"�� ����?
		System.out.println(s.startsWith("ABC"));
		//equals : ���� ��
		System.out.println(s.equals("ABCDEFGH"));
		//��ҹ��� ���о��� ��
		System.out.println(s.equalsIgnoreCase("abcdefgh"));
		s = new String("This is a String");
		//indexOf('i') : 'i'������ �ε��� ����
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf("is"));
		//indexOf('i',7) : 7���ε��� ���Ŀ� 'i'������ �ε���
		System.out.println(s.indexOf('i',7)); //13
		System.out.println(s.indexOf("is",5)); //5
		System.out.println(s.indexOf("is",6));// -1 , ���� ���ٴ� ���
		//lastIndexOf : �ڿ켱 �˻�
		System.out.println(s.lastIndexOf("is")); //5
		
		System.out.println(s.length()); // 16
		//���ڿ� ġȯ
		System.out.println(s.replace('i', 'Q'));
		
		System.out.println(s.replace("is", "QR"));
		//�κ� ���ڿ�
		//substring(5) :5�� �ε������� �������� �κй��ڿ��� ������
		System.out.println(s.substring(5));
		//substring(5,13) :5�� �ε������� 12�������� �κй��ڿ��� ������
		System.out.println(s.substring(5,13));
		//��ҹ��� ��ȯ
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		s = "�ڹ�, JSP, Spring, My Batis, HTML, JavaScript";
		//split(",") : ,�� �������� ���ڿ� �и�
		String tokens[] = s.split(",");
		for(String t : tokens)
			System.out.println(t);
		//trim():������ ����
		for(String t : tokens)
			System.out.println(t.trim());
		// String <= �⺻�ڷ���
		//	+ ������, valueOf(�⺻�ڷ���) =>StringEx1��������
		//	�⺻�ڷ��� <= ���ڿ� ; String Ŭ���������� ����.
		System.out.println(Integer.parseInt("123")+5);
		System.out.println(Double.parseDouble("12.3")+5);
		//format �޼��� : ������ �����ؼ� String�� ��ȯ
		String sf = String.format("%.2f", 12.34567);
		System.out.println(sf);
		//%.1f : ��������� => printf�Լ��� ����� ������
	}

}
