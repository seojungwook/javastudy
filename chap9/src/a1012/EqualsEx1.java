package a1012;
/*
 * equals 메서드 예제
 * Object 클래스의 equals 메서드는 동일한 객체여부를 리턴
 * == 연산자로도 동일 객체 여부 판단 가능
 * equals 메서드의 주된 기능은 내용 비교로 변경되어야 한다.
 * ==> 오버라이딩이 필요
 */
class Value{
	int value;
	Value(int v){
		value= v;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Value){
			Value v = (Value)obj;
			return value == v.value;
		}
	return false;
	}
	
}
public class EqualsEx1 {
	public static void main(String[] args){
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1 == v2)
			System.out.println("v1과 v2는 같은 객체");
		else
			System.out.println("v1과 v2는 다른 객체");
		if(v1.equals(v2)) //값을 같게 하고싶으면 오버라이딩
			System.out.println("v1과 v2는 같은 내용");
		else
			System.out.println("v1과 v2는 다른 내용");
		//String 클래스
		String s1 = new String("abc");
		String s2 = new String("abc");
		if(s1 == s2)
			System.out.println("s1과 s2는 같은 객체");
		else
			System.out.println("s1과 s2는 다른 객체");
		if(s1.equals(s2))
			System.out.println("s1과 s2는 같은 내용");
		else
			System.out.println("s1과 s2는 다른 내용");
	}
}
