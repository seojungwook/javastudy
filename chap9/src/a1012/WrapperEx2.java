package a1012;
/*
 * Character 클래스 예제
 */
public class WrapperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] data = {'A','a','4','&'};
		for(char c : data){
			if(Character.isUpperCase(c))
				System.out.println(c + "대문자");
			else if(Character.isLowerCase(c))
				System.out.println(c + "소문자");
			else if(Character.isDigit(c))
				System.out.println(c + "숫자");
			else 
				System.out.println(c + "일반 문자");
			double d = 10.0/3;
			System.out.println("숫자가 아니니?" + Double.isNaN(d)); //false , 숫자다
			System.out.println("무한대/불능?" + Double.isInfinite(10.0/0));
		}
	}
}
