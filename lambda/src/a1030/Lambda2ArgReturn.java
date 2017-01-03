package a1030;
/*
 * Java8.0�� �߰��� ���ο� ����
 * ���ٽ�(Lambda Expression)
 * 1. �Ű������� ������ �ְ�, ����Ÿ�Ե� �ִ�.
 * 	
 */
@FunctionalInterface
interface LambdaInterface3{
	int method(int x, int y);
//	int method1(int x, int y); //�Ѱ��־���ؼ� ����
	
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
		fi = (x,y)-> sum(x,y); //�Ű������� ���� Ÿ��, �ٸ��Լ� ȣ�⵵ ����
		System.out.println(fi.method(2, 5));
	}
	static int sum(int a, int b){
		return a + b;
	}
}
