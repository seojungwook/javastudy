package test;

/*class Exercise6_22{
	char num;
	
	boolean isNumber(String str){
			for(int i=0; i<str.length();i++){
				num = str.charAt(i);
				if(num>='0' && num<='9') return true;
				
		}
	}
}*/


public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str+"는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까? " + isNumber(str));
	}

	private static boolean isNumber(String str) {
		// TODO Auto-generated method stub
		boolean result = true;
		
		if(str==null||str.equals("")) return false;
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)<'0'||str.charAt(i)>'9'){
				result = false;
				break;
			}
		
		}
		return result;
	}
}
