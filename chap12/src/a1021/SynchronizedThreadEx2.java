package a1021;
/*
 * 동기화 메서드 방식
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
	static synchronized void printChar(char ch){  //이렇게하면 t1, t2, t3에 객체의 각각에 붙는데 
											//static이 붙으면 공유객체가 돼
											//임계영역
		for(int i=1; i<=80; i++){
			System.out.print(ch);
		}
		System.out.println();	
	}
}
class Printer{ //공유객체 : 모든 스레드가 공유하고 있는 객체
	//동기화 메서드
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
