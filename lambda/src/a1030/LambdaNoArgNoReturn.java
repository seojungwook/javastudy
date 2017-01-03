package a1030;
/*
 * 	Java8.0�� �߰��� ���ο� ����
 * 	���ٽ�(Lambda Expression) (�Լ����� ���� �������̽�?)
 * 	1. ���ڰ� ����, ����Ÿ�Ե� ����.
 * 		() -> System.out.println("Hello World");
 */
//������̼�
@FunctionalInterface //�������̽� ���ο� �߻�޼��尡 1��(�׷��� �̰� �͸����Լ��ξ��ž�)
interface LambdaInterface1{
	void method();
}
public class LambdaNoArgNoReturn {
	public static void main(String[] args) {
		LambdaInterface1 fi;
		fi=()->{ //() : �Ű����� ����, (fi��� �ϴ� �Լ��� �̷��� ����)
			String str = "method call1";
			System.out.println(str);
		}; //method �߻�޼��� ����
		fi.method();
		fi=()->{
			System.out.println("method call2");
		};
		fi.method();
		fi=()->System.out.println("method call3");
		fi.method();
	}
}
