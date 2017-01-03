package a1030;
/*
 * Java8.0에 추가된 새로운 문법
 * 람다식(Lambda Expression)
 * 1. 매개변수가 있고, 리턴타입 없다.
 * 	 - 매개변수가 한개인 경우 () 생략이 가능하다.
 * 		(x)->System.out.println("Hello World");
 * 		 x ->System.out.println("Hello World");
 * 	 - 함수의 실행 문장이 한개인 경우 { } 생략가능
 */
@FunctionalInterface
interface LambdaInterface2{
	void method(int x);
}
public class LambdaArgNoReturn {
	public static void main(String[] args) {
		LambdaInterface2 fi;
		fi=(x)->{
			int result = x*5;
			System.out.println(result);
		};
		fi.method(2);
		fi=(x)->{System.out.println(x*10);};
		fi.method(2);
		fi= x ->System.out.println(x*20);
		fi.method(2);
	}
}
