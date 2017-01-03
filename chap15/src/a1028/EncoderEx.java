package a1028;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/*
 * Network���� ����ϴ� Encoder, Decoder
 */
public class EncoderEx {
	public static void main(String[] args) {
		String str = "[Hong Gill Dong : ȫ�浿 123]";
		try{
			String encode = "utf-8";
		//	String encode = "euc-kr";			
			String encodstr = URLEncoder.encode(str,encode);
			String decodstr = URLDecoder.decode(encodstr,encode);
			System.out.println("�������ڿ�" + str);
			System.out.println("encoding ���ڿ�" + encodstr);
			System.out.println("decoding ���ڿ�" + decodstr);
		}catch(UnsupportedEncodingException e){
			e.printStackTrace();
		}
	}
}
