package chap4;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "1234";
		char ch = ' ';
		boolean isNumber = true;
		//value.length():���ڿ��� ���� (5)
		for(int i=0; i<value.length(); i++){
			ch = value.charAt(i);
				if(!(ch>='0' && ch<='9')){
					isNumber=false;
					break;
				}
		}
					
		
		if(isNumber){
			System.out.println(value+"�� �����Դϴ�");
		}else{
			System.out.println(value+"�� ���ڰ� �ƴմϴ�");
			
		}
	}
}

