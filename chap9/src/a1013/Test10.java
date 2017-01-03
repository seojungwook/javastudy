package a1013;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "°¡³ª´Ù";
		System.out.println(format(str,7,0));
		System.out.println(format(str,7,1));
		System.out.println(format(str,7,2));
	}

	static String format(String src, int length, int align){
	if(src.length()>length)
		return src.substring(0,length);
	StringBuffer sb = new StringBuffer();
	for(int i=0; i<length; i++)
		sb.append(" ");
	int len = length -src.length();
	switch(align){
	case 0: sb.replace(0, src.length(), src); break;
	case 1: sb.replace(len/2, src.length()+len/2, src); break;
	case 2: sb.replace(len, length, src); break;
	}
	return sb.toString();
	}
}
