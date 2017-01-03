package chap6;
/*
 * 메서드 오버로딩 예제
 * 오버로딩이란?
 * 	동일한 클래스내에 같은 이름의 메서드가 여러개 존재할 수 있다.
 * 	단 매개변수의 자료형은 달라야 한다.
 * 	매개변수의 개수, 타입, 순서 등.
 * 	매개변수명은 상관 없다.
 * 
 * 오버로딩된 메서드의 선택 기준
 * 1. 호출시 입력딘 자료형과 선언부의 선언된 자료형 동일
 * 2. 1의 조건이 없는 경우
 * 		최소 개수로 자동형변환되는 매개변수를 가진 메서드를 선택함
 * 3. 주의사항 - 동일한 조건인 경우가 여러개인 경우 오류 발생
 */
class Math3{
	int add(int a, int b){
		System.out.print("1: ");
		return a+b;
	}
	long add(int a, long b){
		System.out.print("2: ");
		return a+b;
	}
	long add(long a, int b){
		System.out.print("3: ");
		return a+b;
	}
	long add(long a, long b){
		System.out.print("4: ");
		return a+b;
	}
	int add(int[] a){
		System.out.print("5 : ");
		int result =0;
		for(int i:a)result+=i;
		return result;
	}
}
public class OverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math3 m3 = new Math3();
		System.out.println(m3.add(3,3));
		System.out.println(m3.add(3L,3));
		System.out.println(m3.add(3,3L));
		System.out.println(m3.add(3L,3L));
		System.out.println(m3.add(new int[]{10,20,30}));
	}
}
