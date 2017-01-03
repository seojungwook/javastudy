package a1012;
/*
 * String, StringBuffer 차이
 * 정적,  동적
 * equals 메서드가 오버라이딩 되지않았음.
 */
public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "base";
	//	System.out.println(str.replace('e', 'k').concat("et")); //basket
		System.out.println(str =str.replace('e', 'k').concat("et")); //str= 저장해줌
		str += "ball";
		System.out.println(str);
		//문제 baseball => basketball로 변경되도록
		
		
		StringBuffer sb = new StringBuffer("base");
		System.out.println(sb.replace(3, 4, "k").append("et"));
		sb.append("ball");
		System.out.println(sb);
	}

}
