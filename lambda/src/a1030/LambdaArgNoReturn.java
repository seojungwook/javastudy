package a1030;
/*
 * Java8.0�� �߰��� ���ο� ����
 * ���ٽ�(Lambda Expression)
 * 1. �Ű������� �ְ�, ����Ÿ�� ����.
 * 	 - �Ű������� �Ѱ��� ��� () ������ �����ϴ�.
 * 		(x)->System.out.println("Hello World");
 * 		 x ->System.out.println("Hello World");
 * 	 - �Լ��� ���� ������ �Ѱ��� ��� { } ��������
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
