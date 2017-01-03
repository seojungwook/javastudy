package a1028;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * URLConnection : 추상클래스
 * => URL 객체로부터 객체를 생성함
 */
public class URLConnectionEx {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.naver.com");
		URLConnection urlCon = url.openConnection();
		urlCon.connect();
		Map<String,List<String>> map = urlCon.getHeaderFields();
		Set<String> set = map.keySet();
		for(String key : set){
			String name = key;
			System.out.print(key + " : " );
			List<String> value = map.get(key);
			for(String v : value){
				System.out.println(v);
			}
		}
		System.out.println("문서의 길이 : " + urlCon.getContentLength() + "바이트");
		InputStream in = urlCon.getInputStream();
		System.out.println("문서 내용");
		int data=0;
		byte[] buf = new byte[in.available()];
		while((data=in.read(buf))!=-1){
			System.out.println(new String(buf,0,data,"utf-8"));
		}
		in.close();
	}
}
