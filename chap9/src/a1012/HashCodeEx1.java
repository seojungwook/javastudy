package a1012;
/*
 * hashcode 메서드 예제
 * 해쉬코드란 객체를 구별하는 고유의 값 (주소값 정도)
 * 두객체의 해쉬코드 값이 다른 경우 두 객체는 서로 다른 객체다.
 * => 오버라이딩을 해서 내용비교로 사용이 가능하다.
 * => Collection 에서 다시 설명해줌
 */
public class HashCodeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x={1,2,3};
		int []y = x;
		System.out.println(y[0]);
		String s1 = new String("abc"); 
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1 == s2)
			System.out.println("s1과 s2는 같은 객체");
		else 
			System.out.println("s1과 s2는 다른 객체");
		//원래의 hashCode값
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		//Value클래스의 hashCode구하기
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
	}

}
