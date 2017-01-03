package a1016;
/*
 * jdk5.0부터 제네릭을 사용
 * 제네릭 : 자료형을 실행시 지정
 * 			Collection 프레임워크의 클래스는 
 * 			제네릭화 되어있다.
 */
class GenericEx<T>{ //처음 T는 String, 
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
		String[] ss = {"가", "나", "다"};
		t.set(ss);
		t.print();
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] ii = {1,2,3,4,5};
		t2.set(ii);
		t2.print();
	}

}
