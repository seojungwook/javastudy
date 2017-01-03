package a1019;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규식 예제 : 문자의 형식 지정
 */
public class RegularEx {

	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus",
					"cA","ca","co", "c.", "c0", "car", "combat",
					"count", "data", "disk"};
		//"c[a-z]*" : c로 시작하는 문자열중 
		// 			 a~z 사이의 문자들로만 이루어진
		//			 문자열을 패턴으로 설정
		Pattern p = Pattern.compile("c[a-z]*");
		for(int i=0; i<data.length; i++){
			Matcher m = p.matcher(data[i]);
			if(m.matches()) //Pattern 문자열?
				System.out.print(data[i]+ ",");
		}
		System.out.println();
		String source = "HP : 011-1111-1111, HOME : 02-999-9999";
		/*
		 * \\d : decimal 10진정수
		 * {1,2} : 1개 또는 2개
		 */
		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})"; //(0\\d{1,2}) =>  m.group(1)
															//(\\d{3,4}) =>  m.group(2)
															//(\\d{4}) => m.group(3)
		p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		int i =0;
		while(m.find()){
			System.out.println(++i + ":" + m.group() + "->" + m.group(1) + "," 
							+ m.group(2) + "," + m.group(3));
		}
		//정규식 사용 예제
		String str = "홍길동 , 김삿갓 ,  이몽룡,장길산";
		String [] tokens = str.split("\\s*,\\s*");
		for(String s : tokens)
			System.out.println(s);
		str = "100.0 and 105.5 and 1,100.0  and 5,000";
		//str을 숫자들로 구분하여 출력하기
		String []token = str.split("\\s*and\\s* ");
		double sum =0;
		for(String s : token){
			double d = Double.parseDouble(s.replace(",", ""));
			sum+=d;
			System.out.println(d);
		}
		System.out.println("총합:" +sum);
	}
}	
