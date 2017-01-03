package a1030;
/*
 * 람다식 방식으로 Thread 진행
 */
public class RunnableEx {
	public static void main(String[] args) {
	/*	Runnable runnable = () ->{
			for(int i=0; i<10; i++){
				System.out.println(Thread.currentThread());
			}
		};
		Thread t = new Thread(runnable);
		t.start(); //run()를 알아서 실행해줌
		System.out.println(Thread.currentThread() + "종료");
		*/
	Thread t = new Thread(() -> {
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
	});
	t.start();
	}
}
