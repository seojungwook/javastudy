package a1016;
class GenEx1{
	String msg = "GenEx1";
	String getMsg(){
		return msg;
	}
}
class GenEx2 extends GenEx1{
	String msg = "GenEx2";
	String getMsg(){
		return msg;
	}
}
class GenEx3 extends GenEx2{
	String msg = "GenEx3";
	String getMsg(){
		return msg;
	}
}
public class GenericEx2<T> {
	T v;
	GenericEx2(T n){ v = n;}
	void set(T n){ v = n;}
	T get(){ return v; }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenEx3 g3 = new GenEx3();
		/*
		 * <? super GenEx2> : GenEx2 Ŭ���� �θ�ü ����
		 */
		GenericEx2<? super GenEx2> g2 = new GenericEx2<GenEx1>(g3); //GenEx1�� ��� ��ü�� g3����?
		GenEx3 test = (GenEx3)g2.get();
		Object test2 = g2.get();
		System.out.println("��� :" + test.msg);       //��� :GenEx3
		System.out.println("��� :"+ test.getMsg());   //��� :GenEx3
		/*
		 * <? extends GenEx2> : GenEx2 Ŭ���� �ڼ�Ŭ������ Ÿ������ ����
		 */
		GenericEx2<? extends GenEx2> g4 = new GenericEx2<GenEx3>(g3);
		GenEx2 test3= g4.get();		//GenEx3 ��ü
		GenEx3 test4 = (GenEx3)g4.get();
		System.out.println("��� :" + test3.msg);	//��� GenEx2 
		System.out.println("��� :"+ test3.getMsg()); //��� GenEx3 //���� �������̵��Ȱ��� ȣ��
		System.out.println("��� :" + test4.msg);	//��� :GenEx3
		System.out.println("��� :"+ test4.getMsg());	//��� :GenEx3
		//<?> : ��� Ÿ�� ���� 
		GenericEx2<?> g5 = new GenericEx2<GenEx3>(g3);
		Object test5 = g5.get(); //���Ÿ���̱⿡
	}

}
