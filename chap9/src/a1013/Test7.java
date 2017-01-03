package a1013;

public class Test7 {
	static boolean contains(String src, String target){
		if(!(src.indexOf(target)==-1)){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}

}
