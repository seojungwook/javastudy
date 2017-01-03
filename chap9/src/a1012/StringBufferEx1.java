package a1012;
/*390p
 * 
 * StringBuffer 클래스
 * 동적인 문자열 객체
 * equals 메서드가 오버라이딩 되지않았음.
 * => 내용비교를 위해서는 toString()메서드를 사용하여 
 * String으로 변경 후 equals 메서드를 사용해야한다.
 * 
 */
public class StringBufferEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		if(sb1==sb2)
			System.out.println("sb1과 sb2는 같은 객체");
		else 
			System.out.println("sb1과 sb2는 다른 객체");
		if(sb1.equals(sb2)) 
			System.out.println("sb1과 sb2는 같은 내용");
		else
			System.out.println("sb1과 sb2는 다른 내용");
		if(sb1.toString().equals(sb2.toString())) //문자로 변경한 다음
			System.out.println("sb1과 sb2는 같은 내용");
		else
			System.out.println("sb1과 sb2는 다른 내용");
	}

}
