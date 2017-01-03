package chap6;
/* 177p ���ߵ�
 * �⺻�� �Ű�����, ������ �Ű�����
 * �⺻�� �Ű����� : ���� ����Ǿ ȣ���ϴ� �޼����� ������ ���� �Ұ�, ��ȸ�� ���� (�ݹ��̹�� call by value
 * ������ �Ű����� : �������� ����ǹǷ� ȣ���ϴ� �޼����� �������� ���� ����, ��ȸ�� ���� ���� (�ݹ��̷��۷��� call by reference
 */
class Data { int x; }
public class ParameterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("main : x = " + d.x);
		
		change(d.x);
		System.out.println("after change(d.x) :"+ d.x);
		System.out.println();
		change2(d);
		System.out.println("after change2(d.x) :"+ d.x);
	}

	private static void change2(Data d) {
		// TODO Auto-generated method stub
		d.x = 1000;
		System.out.println("change2() x :"+ d.x);
	}

	private static void change(int x) {
		// TODO Auto-generated method stub
		x = 1000;
		System.out.println("change() x : "+ x);
	}

}
