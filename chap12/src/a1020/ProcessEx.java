package a1020;
/*
 * 프로세스 예제
 */
public class ProcessEx {
	public static void main(String[] args) {
		/*
		 * Process : OS가 관리하는 프로세스
		 * Runtime.getRuntime() : OS로부터 프로세스 실행권한 받기
		 * 
		 */
		try{
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			Process p3 = Runtime.getRuntime().exec("notepad.exe");
			//p1.waitFor() : p1 프로세스가 종료시까지 main 메서드 대기
			p1.waitFor(); 
			p2.destroy();
			p3.destroy();

		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
