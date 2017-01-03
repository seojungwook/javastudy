package chap6;
/*	181p �ʱ�, 185p
 *  Ŭ���� ����� �ν��Ͻ� ������� ȣ�� ����
 */
public class MemberCall {
	int iv =10; //�ν��Ͻ� ����
	static int cv = 20; //Ŭ���� ����
	int iv2 = iv; //�ν��Ͻ� ����
	//static int cv2 = iv; //��üȭ�� �Ǿ�� ������ �ȳ�
	static int cv2 = new MemberCall().iv;
	static void staticMethod1(){ //Ŭ���� �޼���
		System.out.println(cv);
		//System.out.println(iv);
		System.out.println(new MemberCall().iv);
	}
	void instanceMethod1(){
		System.out.println(cv); //Ŭ���� ������ �̹� �Ҵ�(��üȭ) �޾ұ⿡
		System.out.println(iv); //���� �ν��Ͻ� ����̱⿡
	}
	
	static void staticMethod2(){ //Ŭ���� �޼���
		staticMethod1(); 
		//instanceMethod1();
		new MemberCall().instanceMethod1();
	}
	
	void instanceMethod2(){
		staticMethod1();
		instanceMethod1();
	}
}
