package a1012;
/*
 * toString() �޼���
 * ��ü�� ���ڿ�ȭ�� �����ϴ� �޼���
 * Object Ŭ������ ������ ������ Ŭ������@16�����ؽ��ڵ尪���� ǥ����.
 */
class Value2{
	int value;
	Value2(int value){
		this.value= value;
	}
	//����� ��ȸ�ϵ��� toString()�޼��� �������̵� �ʿ�
	@Override
	public String toString() {
		return "Value2 [value=" + value + "]";
	}
}
public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value2 v1 = new Value2(10);
		Value2 v2 = new Value2(10);
		System.out.println(v1);//���������� �ϸ� �ڵ����� toString() �޼��� ȣ��
		System.out.println(v2);
		Class c = v1.getClass();//v1�̶�� ��ü�� ������ ��ü��
								//(�������κи���� ��κ� ���������� ��ü)
		System.out.println(c.getName());
		Object o = v1;
		System.out.println(o.getClass().getName());
	}

}
