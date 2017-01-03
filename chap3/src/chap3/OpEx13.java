package chap3;
/*
 *  연습문제 3-9
 */
public class OpEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '2';
		boolean b = ((ch >= 'A' && ch <= 'Z')||
					(ch >= 'a' && ch <= 'z')||
					(ch >= '0' && ch <= '9')); 
		System.out.println(b);
		
	}

}
