package a1008;
/*
 * 상속을 받아서 내가 예외를 할 수도 있다는 걸 보여준거
 */
class MemoryException extends Exception{
	MemoryException(){
		super("메모리 부족!");
	}
}
class SpaceException extends Exception{
	final int ERR_CODE;
	SpaceException(){
		super("설치 공간 부족");
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
			System.out.println("메모리가 부족합니다.");
			e.printStackTrace();
		} catch(SpaceException e){
			System.out.println("설치 공간이 부족합니다.");
			System.out.println("오류코드: "+ e.ERR_CODE);
			e.printStackTrace();
		}
	}
}
