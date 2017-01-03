package a1013;
/*
 * ����Ŭ���� ���� 2
 * 1. ����Ŭ������ �ܺ�Ŭ������ ����� ������ ������.
 * 	  static ����Ŭ������ Ŭ���� ����� 
 *    instance����Ŭ������ �ν��Ͻ� ����� ������ ���.
 */
public class InnerEx2 {
	private int outeriv = 10;
	static int outercv = 20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner{
		//int siv = outeriv;
		int siv = new InnerEx2().outeriv; //��üȭ �Ǿ�� ���
		static int scv = outercv;
	} //static ����Ŭ����
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
//	static InstanceInner cv2 = new InstanceInner(); //��üȭ�ؾ� ����
	static void staticMethod(){
		StaticInner obj = new StaticInner();
		//�ܺ�Ŭ������ ��üȭ��Ų �� ����Ŭ���� ��üȭ
		InstanceInner obj2 = new InnerEx2().new InstanceInner(); 
	}
	void instanceMethod(){
		StaticInner obj = new StaticInner();
		InstanceInner obj2 = new InstanceInner();
	}
	void method(int piv){
		//piv = 1000;
		int lv = 0; //��������
		final int LV = 30; //���
		/*
		 * ������ ��������Ŭ�������� �ܺθ޼����� ���������� ȣ��Ұ�
		 * => jdk7.0���Ŀ� ���ȭ�ȴٸ�(�������)�� ���� �㰡
		 */
		class LocalInner{ //��������Ŭ�������� �ܺ�Ŭ������ ���ٰ���
			int liv = outeriv;
			int liv2 = outercv; //��������Ŭ�������� static�� ���ٰ���
			int liv3 = lv; //���ȭ �Ǿ�� �Ѵ�.(��𼭵� ����Ǹ� �ȵ�)
			int liv4 = LV;
			void method(){
			//	lv = 200; //���ȭ�Ǿ���ϱ⿡ �̰Ÿ� ����
				System.out.println(piv + ","+LV);
				System.out.println(liv + "," + liv2 +","+liv3+","+liv4);
			}
			
		}
		LocalInner ll = new LocalInner();// ����1 �� - ��üȭ�� �ʿ��ϱ⿡
		ll.method();					//	����1 ��
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����1 LocalInner ����Ŭ������ method() ȣ��
		InnerEx2 in = new InnerEx2(); // ����1��
		in.method(500); 				// ����1 ��
		//����2 Instanceinner�� ��������� �� ����ϱ�
		InstanceInner ii = in.new InstanceInner(); //����2
		System.out.println("instanceInner Ŭ������ ��� ���� :"+ii.iiv +","+ ii.iiv2);
		//����3 Static�� ��������� �� ����ϱ�
		
		System.out.println("StaticInner Ŭ������ ��� ���� :"+
		new StaticInner().siv +","+ new StaticInner().scv);
	}

}
