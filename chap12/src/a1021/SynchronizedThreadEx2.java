package a1021;
/*
 * ����ȭ �޼��� ���
 */
class PrintThread3 extends Thread{
	Printer ptr;
	char ch;
	PrintThread3(Printer ptr, char ch){
		this.ptr = ptr;
		this.ch = ch;
	}
	public void run(){
		for(int i=1; i<=10; i++){
	//		ptr.printChar(ch);
			printChar(ch);
			
		}
	}
	static synchronized void printChar(char ch){  //�̷����ϸ� t1, t2, t3�� ��ü�� ������ �ٴµ� 
											//static�� ������ ������ü�� ��
											//�Ӱ迵��
		for(int i=1; i<=80; i++){
			System.out.print(ch);
		}
		System.out.println();	
	}
}
class Printer{ //������ü : ��� �����尡 �����ϰ� �ִ� ��ü
	//����ȭ �޼���
	synchronized void printChar(char ch){
		for(int i=1; i<=80; i++){
			System.out.print(ch);
		}
		
	}
}
public class SynchronizedThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer ptr = new Printer();
		PrintThread3 t1 = new PrintThread3(ptr,'A');
		PrintThread3 t2 = new PrintThread3(ptr,'B');
		PrintThread3 t3 = new PrintThread3(ptr,'C');
		t1.start(); t2.start(); t3.start();
	}
}
