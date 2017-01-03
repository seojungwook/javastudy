package chap4;
/*
 * 반복문 예제
 */
public class LoopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문 없이 1부터 10까지 출력하기
		System.out.println("반복문 없이 1부터 10까지 출력하기");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.print(6);
		System.out.print(7);
		System.out.print(8);
		System.out.print(9);
		System.out.println(10);
		
		System.out.println("for문으로 1부터 10까지 출력하기");
		
	for(int i=1;i<=10;i++){
			System.out.print(i);
		}
	 	/* 처리 순서
	 	 * 1. i <= 1
	 	 * 2. i<=10 : 참
	 	 * 3. 화면에 1 출력
	 	 * 4. i++;  : i = 2
	 	 * 5. i<=10 : 참
	 	 * 6. 화면에 2 출력
	 	 * ...
	 	 * n1. i = 9
	 	 * n2. i<=10 : 참
	 	 * n3. 화면에 9출력
	 	 * n4. i = 11
	 	 * n5. i<=10 : 거짓
	 	 */
		System.out.println();
		System.out.println("while문으로 1부터 10까지 출력하기");
		int i = 1;
		while(i<=10){
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println(i);
		System.out.println("do while문으로 1부터 10까지 출력하기");
		i = 1;
		do{
			System.out.print(i);
			i++;
		}while(i<=10);
		System.out.println();
	}

}
