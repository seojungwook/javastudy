package a1021;
/*
 * 동기화 되지 않은 경우
 */
class PrintThread extends Thread{
	char ch;
	PrintThread(char ch){
		this.ch = ch;
	}
	public void run(){
		for(int i=1; i<=10;i++){
			for(int j=1; j<=80; j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
public class NoSynThreadEx {
	public static void main(String[] args) {
		PrintThread t1 = new PrintThread('A');
		PrintThread t2 = new PrintThread('B');
		PrintThread t3 = new PrintThread('C');
		t1.start(); t2.start(); t3.start();
	
	}
}
