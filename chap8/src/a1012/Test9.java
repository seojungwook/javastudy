package a1012;

class UnsupportedFuctionException extends RuntimeException{
	private final int ERR_CODE=100;
	
	UnsupportedFuctionException(String msg, int errcode){
		super(msg);
		//ERR_CODE = errcode; //�����ڿ��� �ʱ�ȭ
	}
	public int getErrorCode(){
		return ERR_CODE;
	}
	@Override
	public String getMessage(){
		return "[" + getErrorCode() + "]"+super.getMessage();
	}
}
public class Test9 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		throw new UnsupportedFuctionException("�������� �ʴ� ����Դϴ�.",100);
	}

}
