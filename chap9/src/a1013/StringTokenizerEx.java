package a1013;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ȫ�浿#���##�̸���#������#�Ӳ���#";
		StringTokenizer st = new StringTokenizer(str,"#");
		int cnt = st.countTokens();
		System.out.println("�Ľ��� ���ڿ��� ����:"+cnt);
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		String[] stokens = str.split("#");
		System.out.println("split ���ڿ��� ����:"+stokens.length);
		for(String s : stokens)
			System.out.println(s);
	}

}
