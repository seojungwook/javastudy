package a1020;
/*
 * ���μ��� ����
 */
public class ProcessEx {
	public static void main(String[] args) {
		/*
		 * Process : OS�� �����ϴ� ���μ���
		 * Runtime.getRuntime() : OS�κ��� ���μ��� ������� �ޱ�
		 * 
		 */
		try{
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			Process p3 = Runtime.getRuntime().exec("notepad.exe");
			//p1.waitFor() : p1 ���μ����� ����ñ��� main �޼��� ���
			p1.waitFor(); 
			p2.destroy();
			p3.destroy();

		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
