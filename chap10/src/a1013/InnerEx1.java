package a1013;
/*
 * ���� Ŭ���� ����
 * 	1. Ŭ���� ���ο� �����ϴ� Ŭ����(Ŭ�������� Ŭ����)
 * 	2. �����ڷ���, ��üȭ ����, Object�� ����Ŭ����,
 * 	   ���(������)�� ������
 * 	3. �ܺ�Ŭ������ �����. �ܺ�Ŭ������ private����� ���ٰ���
 * 	���� Ŭ������ ����
 * 	1. static ����Ŭ���� : static ����� ����
 * 	2. instance ����Ŭ���� : static ����� ���������
 * 	3. local ����Ŭ���� : method ���ο��� ����� ����Ŭ����
 * 						  method������ ��밡��
 * 	4. �̸����� ����Ŭ���� : awt(GUI) ���� �ٽ� ����
 * 							 �̺�Ʈó���� ����
 */
public class InnerEx1 { //�ܺ�Ŭ����
	class InstanceInner{ //�ν��Ͻ�����Ŭ����
		int iv =100;
		//static int cv = 10; //static���(Ŭ�������) �����Ұ���
		final static int MAX = 100; //��, ����� ����
									//cf. ���Ǯ�� �������
	}
	static class StaticInner{ //static ����Ŭ����(static���������)
		int iv = 200;
		static int cv = 300;
	}
	void method(){
		class LocalInner{ //��������Ŭ���� :����� �޼��峻������ ���� ����
			int iv = 300;
			final static int MAX =100; //�������
		}
		LocalInner ll= new LocalInner();
		System.out.println(ll.iv);
		System.out.println(LocalInner.MAX);

	}
	void method2(){
	//	LocalInner ll = new LocalInner(); //LocalInner()�� ��������Ŭ������ 
											//����Ǿ��⿡ ���⼱ ���Ұ�
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerEx1 in = new InnerEx1();
		in.method(); //method()�Լ��� ���� �� �Լ��� ��üȭ //300 
															//100
		System.out.println(InstanceInner.MAX); //100 //����� ����
		System.out.println(StaticInner.cv); //300
		StaticInner si = new StaticInner();
		System.out.println(si.iv); //200
		InstanceInner ii = in.new InstanceInner(); //�ν��Ͻ���� //�ܺ�Ŭ������ ���� ��üȭ�Ǿ��(in.)
		System.out.println(ii.iv);
	}

}
