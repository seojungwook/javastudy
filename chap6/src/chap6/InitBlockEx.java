package chap6;
/*
 * 초기화 블럭 예제
 * static 초기화 블럭 : 클래스변수의 초기화 담당
 * 					클래스 정보가 로드 된 후 가장 먼저 1번 실행됨.
 * 					많이 쓰이진 않지만 사용되고 있음
 * 인스턴스 초기화 블럭 : 객체화 될 때마다 호출(인스턴스 초기화 블럭이 실행되고 생성자가 실행)
 * 				    많이 쓰이진 않아
 */
public class InitBlockEx {
	static int cv;
	//static 초기화 블럭
	static { 
		cv = (int)(Math.random()*100);
		System.out.println("static 초기화블럭 cv="+cv);
	}
	// 인스턴스 초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭");
		System.out.println("생성자 보다 먼저 호출됨");
	}
	InitBlockEx(){
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 메서드 시작");
		InitBlockEx init1 = new InitBlockEx();
		InitBlockEx init2 = new InitBlockEx();
		System.out.println("main 메서드 종료");
		
	}

}
