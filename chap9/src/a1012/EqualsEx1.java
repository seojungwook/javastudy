package a1012;
/*
 * equals �޼��� ����
 * Object Ŭ������ equals �޼���� ������ ��ü���θ� ����
 * == �����ڷε� ���� ��ü ���� �Ǵ� ����
 * equals �޼����� �ֵ� ����� ���� �񱳷� ����Ǿ�� �Ѵ�.
 * ==> �������̵��� �ʿ�
 */
class Value{
	int value;
	Value(int v){
		value= v;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value){
			Value v = (Value)obj;
			return value == v.value;
		}
	return false;
	}
	
}
public class EqualsEx1 {
	public static void main(String[] args){
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1 == v2)
			System.out.println("v1�� v2�� ���� ��ü");
		else
			System.out.println("v1�� v2�� �ٸ� ��ü");
		if(v1.equals(v2)) //���� ���� �ϰ������ �������̵�
			System.out.println("v1�� v2�� ���� ����");
		else
			System.out.println("v1�� v2�� �ٸ� ����");
		//String Ŭ����
		String s1 = new String("abc");
		String s2 = new String("abc");
		if(s1 == s2)
			System.out.println("s1�� s2�� ���� ��ü");
		else
			System.out.println("s1�� s2�� �ٸ� ��ü");
		if(s1.equals(s2))
			System.out.println("s1�� s2�� ���� ����");
		else
			System.out.println("s1�� s2�� �ٸ� ����");
	}
}
