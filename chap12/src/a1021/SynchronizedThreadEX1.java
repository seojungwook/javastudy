package a1021;
/*	����ȭ ���
 * 1. ����ȭ ��   : �޼��� ���� ������
 * 2. ����ȭ �޼��� : �޼�����ü�� ����ȭ �Ǿ� �ִ�.
 * ����ȭ�� ���� ����� : synchronized
 * 
 * ����ȭ ���� ����� ����1
 * lock�� �ݵ�� ��ü���� ��. �⺻�� ������ lock���� ����� �� ����.
 * lock���� ����ϴ� ��ü�� ���α׷����� �����ؾ� �Ѵ�.(static�� ����)
 *  => ��� �����尡 �ϳ��� lock�� �����ؾ� �Ѵ�.
 */
class PrintThread2 extends Thread{
	char ch;
//	static Object lock = new Object();
	static Integer lock=0; // Integer�� �����ڷ���(��ü) �̱⿡ ����, 
							//int���� �⺻�ڷ����̱⿡ �Ұ�
	PrintThread2(char ch){
		this.ch = ch;
	}
	public void run(){
	//	synchronized(lock){  //�Ӱ迵��
		for(int i=1; i<=10;i++){
			synchronized(lock){
			for(int j=1; j<=80; j++){
				System.out.print(ch);
			}
		}//�Ӱ迵���� ����Ǵ� ������ lock ����
			System.out.println();
	} 
}
}
public class SynchronizedThreadEX1 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		t1.start(); t2.start(); t3.start();
	}
}
