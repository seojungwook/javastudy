package a1030;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;

/*
 * Consumer 인터페이스
 */
public class ConsumerEx {
	public static void main(String[] args) {
		//Consumer : 매개변수가 있고, 리턴타입이 없다.
		//		   : 객체를 주입하고, Consumer 사용
		Consumer<String> c1 = t->System.out.println(t +8);
		c1.accept("java");
		BiConsumer<String, String> c2 = (t,u) -> System.out.println( t + u );
		c2.accept("java", "8");
		DoubleConsumer c3 = d->System.out.println("Java" + d);
		c3.accept(8.0);
		Consumer<Double> c4 = d->System.out.println("Java" + d);
		c4.accept(8.0);
		//Supplier 예제
		//	  : 매개변수는 없고, 리턴타입 존재
		IntSupplier is = () -> {
			int num = (int)(Math.random()*6) +1;
			return num;
		};
		int num = is.getAsInt();
		System.out.println("주사위 눈의 수 : " + num);
	}
}
