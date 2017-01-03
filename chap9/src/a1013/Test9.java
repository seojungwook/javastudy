package a1013;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(1!2@3^4~5)"+" -> " + delChar("1!2@3^4~5","~!@#$%^&*()"));
		System.out.println("(1 2   3  4\t5)"+" -> "+ delChar("(1 2   3  4\t5)"," \t"));
	}

	static String delChar(String src, String delCh) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<src.length();i++){
			if(delCh.indexOf(src.charAt(i)) <0 )
				sb.append(src.charAt(i));
		/*	for(int j=0; j<delCh.length();j++){
				if(src.charAt(i)==delCh.charAt(j)){
				}
			}*/
		}
		return sb.toString();
	}

}
