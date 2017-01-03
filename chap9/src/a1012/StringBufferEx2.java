package a1012;
/*
 * StringBuffer Ŭ���� 
 * ������ ���ڿ�, ��ü ������ 16����Ʈ������ ���۸� ������.
 * 
 * StringBuilder(jdk5.0 ����) Ŭ������ �޼��尡 �����ϴ�.
 * StringBuffer : ����޼��尡 �����忡 ����ȭ�Ǿ� �ִ�. (�����忡 ����ȭ �Ǿ������� ����ӵ��� ����)
 * StringBuilder : ����޼��尡 �����忡 ����ȭ�Ǿ� ���� �ʴ�.
 */
public class StringBufferEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append(true);
		System.out.println(sb);
		
		//1���ε������� 3���ձ���(2���ε���) ����
		sb.delete(1, 3);
		System.out.println(sb);
		sb.deleteCharAt(4); 	//4���ε��� ���� ����
		System.out.println(sb);
		sb.insert(5, "@@"); 	//5���ε����� @@���� �߰�
		System.out.println(sb);
		sb.insert(6, 7.89); 
		System.out.println(sb);
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc"); // 0���ε������� 2���ε����� ���ڸ� abc����
		System.out.println(sb);
		sb.reverse(); 			//���ڿ��� ���� �ٲٱ�
		System.out.println(sb);
	}

}
