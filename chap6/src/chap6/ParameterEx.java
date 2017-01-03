package chap6;
/* 177p 봐야돼
 * 기본형 매개변수, 참조형 매개변수
 * 기본형 매개변수 : 값이 복사되어서 호출하는 메서드의 변수값 변경 불가, 조회만 가능 (콜바이밸류 call by value
 * 참조형 매개변수 : 참조값이 복사되므로 호출하는 메서드의 변수값을 변경 가능, 조회와 변경 가능 (콜바이레퍼런스 call by reference
 */
class Data { int x; }
public class ParameterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("main : x = " + d.x);
		
		change(d.x);
		System.out.println("after change(d.x) :"+ d.x);
		System.out.println();
		change2(d);
		System.out.println("after change2(d.x) :"+ d.x);
	}

	private static void change2(Data d) {
		// TODO Auto-generated method stub
		d.x = 1000;
		System.out.println("change2() x :"+ d.x);
	}

	private static void change(int x) {
		// TODO Auto-generated method stub
		x = 1000;
		System.out.println("change() x : "+ x);
	}

}
