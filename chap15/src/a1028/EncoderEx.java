package a1028;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/*
 * Network에서 사용하는 Encoder, Decoder
 */
public class EncoderEx {
	public static void main(String[] args) {
		String str = "[Hong Gill Dong : 홍길동 123]";
		try{
			String encode = "utf-8";
		//	String encode = "euc-kr";			
			String encodstr = URLEncoder.encode(str,encode);
			String decodstr = URLDecoder.decode(encodstr,encode);
			System.out.println("원래문자열" + str);
			System.out.println("encoding 문자열" + encodstr);
			System.out.println("decoding 문자열" + decodstr);
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
	}
}
