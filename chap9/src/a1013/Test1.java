package a1013;

class SutdaCard {
	final int num;
	final boolean isKwang;
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof SutdaCard){
			SutdaCard su = (SutdaCard)obj;
			return ((num == su.num) && (isKwang==su.isKwang));
		}else
		return false;
	}
	public String toString(){
		return num + (isKwang?"K":"");
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));
		
	}

}
