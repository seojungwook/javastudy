package a1030;
/*
 * ���ٽ� ������� Thread ����
 */
public class RunnableEx {
	public static void main(String[] args) {
	/*	Runnable runnable = () ->{
			for(int i=0; i<10; i++){
				System.out.println(Thread.currentThread());
			}
		};
		Thread t = new Thread(runnable);
		t.start(); //run()�� �˾Ƽ� ��������
		System.out.println(Thread.currentThread() + "����");
		*/
	Thread t = new Thread(() -> {
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
	});
	t.start();
	}
}
