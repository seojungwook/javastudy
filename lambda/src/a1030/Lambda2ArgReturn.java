package a1030;
/*
 * Java8.0에 추가된 새로운 문법
 * 람다식(Lambda Expression)
 * 1. 매개변수가 여러개 있고, 리턴타입도 있다.
 * 	
 */
@FunctionalInterface
interface LambdaInterface3{
	int method(int x, int y);
//	int method1(int x, int y); //한개있어야해서 에러
	
}
public class Lambda2ArgReturn {
	public static void main(String[] args) {
		LambdaInterface3 fi;
		fi = (x,y)->{
			int result = x*y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		fi = (x,y)->{return y-x;};
		System.out.println(fi.method(2, 5));
		fi = (x,y)-> x + y;
		System.out.println(fi.method(2, 5));
		fi = (x,y)-> sum(x,y); //매개변수가 같은 타입, 다른함수 호출도 가능
		System.out.println(fi.method(2, 5));
	}
	static int sum(int a, int b){
		return a + b;
	}
}
