package a1008;
/*
 * ����� �޾Ƽ� ���� ���ܸ� �� ���� �ִٴ� �� �����ذ�
 */
class MemoryException extends Exception{
	MemoryException(){
		super("�޸� ����!");
	}
}
class SpaceException extends Exception{
	final int ERR_CODE;
	SpaceException(){
		super("��ġ ���� ����");
		ERR_CODE =100;
	}
	int getErrCode(){
		return ERR_CODE;
	}
}
public class ExceptionEx9 {
	static boolean isSpace(){return true;}
	static boolean isMemory(){return false;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			if(!isMemory())
				throw new MemoryException();
			if(!isSpace())
				throw new SpaceException();
			
		} catch(MemoryException e){
			System.out.println("�޸𸮰� �����մϴ�.");
			e.printStackTrace();
		} catch(SpaceException e){
			System.out.println("��ġ ������ �����մϴ�.");
			System.out.println("�����ڵ�: "+ e.ERR_CODE);
			e.printStackTrace();
		}
	}
}
