package a1013;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "È«±æµ¿#±è»ñ°«##ÀÌ¸ù·æ#¼ºÃáÇâ#ÀÓ²©Á¤#";
		StringTokenizer st = new StringTokenizer(str,"#");
		int cnt = st.countTokens();
		System.out.println("ÆÄ½ÌÇÒ ¹®ÀÚ¿­ÀÇ °³¼ö:"+cnt);
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		String[] stokens = str.split("#");
		System.out.println("split ¹®ÀÚ¿­ÀÇ °³¼ö:"+stokens.length);
		for(String s : stokens)
			System.out.println(s);
	}

}
