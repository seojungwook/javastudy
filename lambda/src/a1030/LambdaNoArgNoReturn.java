package a1030;
/*
 * 	Java8.0에 추가된 새로운 문법
 * 	람다식(Lambda Expression) (함수만을 위한 인터페이스?)
 * 	1. 인자가 없고, 리턴타입도 없다.
 * 		() -> System.out.println("Hello World");
 */
//어노테이션
@FunctionalInterface //인터페이스 내부에 추상메서드가 1개(그래서 이걸 익명의함수로쓸거야)
interface LambdaInterface1{
	void method();
}
public class LambdaNoArgNoReturn {
	public static void main(String[] args) {
		LambdaInterface1 fi;
		fi=()->{ //() : 매개변수 없고, (fi라고 하는 함수를 이렇게 구현)
			String str = "method call1";
			System.out.println(str);
		}; //method 추상메서드 구현
		fi.method();
		fi=()->{
			System.out.println("method call2");
		};
		fi.method();
		fi=()->System.out.println("method call3");
		fi.method();
	}
}
