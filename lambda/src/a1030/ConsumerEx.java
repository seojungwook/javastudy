package a1030;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;

/*
 * Consumer �������̽�
 */
public class ConsumerEx {
	public static void main(String[] args) {
		//Consumer : �Ű������� �ְ�, ����Ÿ���� ����.
		//		   : ��ü�� �����ϰ�, Consumer ���
		Consumer<String> c1 = t->System.out.println(t +8);
		c1.accept("java");
		BiConsumer<String, String> c2 = (t,u) -> System.out.println( t + u );
		c2.accept("java", "8");
		DoubleConsumer c3 = d->System.out.println("Java" + d);
		c3.accept(8.0);
		Consumer<Double> c4 = d->System.out.println("Java" + d);
		c4.accept(8.0);
		//Supplier ����
		//	  : �Ű������� ����, ����Ÿ�� ����
		IntSupplier is = () -> {
			int num = (int)(Math.random()*6) +1;
			return num;
		};
		int num = is.getAsInt();
		System.out.println("�ֻ��� ���� �� : " + num);
	}
}
