package a1016;
/*
 * jdk5.0���� ���׸��� ���
 * ���׸� : �ڷ����� ����� ����
 * 			Collection �����ӿ�ũ�� Ŭ������ 
 * 			���׸�ȭ �Ǿ��ִ�.
 */
class GenericEx<T>{ //ó�� T�� String, 
	T[] v;
	public void set(T[] n){
		v= n;
	}
	public void print() {
		for(T s :v )
			System.out.println(s);
	}
}
public class GenericEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericEx<String> t = new GenericEx<String>();
		String[] ss = {"��", "��", "��"};
		t.set(ss);
		t.print();
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] ii = {1,2,3,4,5};
		t2.set(ii);
		t2.print();
	}

}
