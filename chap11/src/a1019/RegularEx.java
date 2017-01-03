package a1019;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ���Խ� ���� : ������ ���� ����
 */
public class RegularEx {

	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus",
					"cA","ca","co", "c.", "c0", "car", "combat",
					"count", "data", "disk"};
		//"c[a-z]*" : c�� �����ϴ� ���ڿ��� 
		// 			 a~z ������ ���ڵ�θ� �̷����
		//			 ���ڿ��� �������� ����
		Pattern p = Pattern.compile("c[a-z]*");
		for(int i=0; i<data.length; i++){
			Matcher m = p.matcher(data[i]);
			if(m.matches()) //Pattern ���ڿ�?
				System.out.print(data[i]+ ",");
		}
		System.out.println();
		String source = "HP : 011-1111-1111, HOME : 02-999-9999";
		/*
		 * \\d : decimal 10������
		 * {1,2} : 1�� �Ǵ� 2��
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
		//���Խ� ��� ����
		String str = "ȫ�浿 , ��� ,  �̸���,����";
		String [] tokens = str.split("\\s*,\\s*");
		for(String s : tokens)
			System.out.println(s);
		str = "100.0 and 105.5 and 1,100.0  and 5,000";
		//str�� ���ڵ�� �����Ͽ� ����ϱ�
		String []token = str.split("\\s*and\\s* ");
		double sum =0;
		for(String s : token){
			double d = Double.parseDouble(s.replace(",", ""));
			sum+=d;
			System.out.println(d);
		}
		System.out.println("����:" +sum);
	}
}	
