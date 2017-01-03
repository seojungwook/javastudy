package chap3;
/*
 *  연습문제 3-10
 */
public class OpEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'B';
		char lowerCase = (char) ((ch>='A' && ch<='Z')?(ch+32):ch);
		
		System.out.println("ch: "+ch);
		System.out.println("ch to lowerCase: "+lowerCase);
	}

}
