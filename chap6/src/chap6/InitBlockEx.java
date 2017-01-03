package chap6;
/*
 * �ʱ�ȭ �� ����
 * static �ʱ�ȭ �� : Ŭ���������� �ʱ�ȭ ���
 * 					Ŭ���� ������ �ε� �� �� ���� ���� 1�� �����.
 * 					���� ������ ������ ���ǰ� ����
 * �ν��Ͻ� �ʱ�ȭ �� : ��üȭ �� ������ ȣ��(�ν��Ͻ� �ʱ�ȭ ���� ����ǰ� �����ڰ� ����)
 * 				    ���� ������ �ʾ�
 */
public class InitBlockEx {
	static int cv;
	//static �ʱ�ȭ ��
	static { 
		cv = (int)(Math.random()*100);
		System.out.println("static �ʱ�ȭ�� cv="+cv);
	}
	// �ν��Ͻ� �ʱ�ȭ ��
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
		System.out.println("������ ���� ���� ȣ���");
	}
	InitBlockEx(){
		System.out.println("������");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main �޼��� ����");
		InitBlockEx init1 = new InitBlockEx();
		InitBlockEx init2 = new InitBlockEx();
		System.out.println("main �޼��� ����");
		
	}

}
