package a1030;
/*
 * 
 */
interface MyFunctionInterface{
	void method();
}
class LocalVariable{
	void method(int a){
		int lv = 40;
		MyFunctionInterface fi = () ->{
			System.out.println("arg:" + a);
		//	lv = 100; //내부클래스이기에 final화 필요
			System.out.println("localValue:" + lv);
		};
		fi.method();
	}
}
class UsingThis {
	public int ov = 10;
	class Inner{
		int iv = 20;
		void method(){
			ov = 100;
			MyFunctionInterface fi = () ->{
				System.out.println("Out Field :" + ov);
				System.out.println("Out Field :" + UsingThis.this.ov);
				iv = 200;
				System.out.println("Inner Field : " + iv);
				System.out.println("Inner Field : " + this.iv);
			};
			fi.method();
		}
	}
}
public class LocalVarEx {
	public static void main(String[] args) {
		LocalVariable lvo = new LocalVariable();
		lvo.method(20);
		UsingThis ut = new UsingThis();
		UsingThis.Inner inner = ut.new Inner();
		inner.method();
	}
}
