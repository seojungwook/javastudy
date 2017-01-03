package a1013;

public class Test6 {
	public static String fillZero(String src, int length){
		String zero="";
		if(src==null||src.length() == length){
			return src;
		}
		if(length==0 || length<0){
			return "";
		}
		if(src.length()>length)
			return src.substring(0,length);
	//	char c[] = new char[length];
		
		for(int i=0;i<length-src.length();i++)
			zero+="0";
	/*	for(int i =0; i<c.length;i++)
			c[i]=0;
		for(int j=0; j<src.length();j++){
			c[j] =src.charAt(j);
		}*/
		return zero+src;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}

}
