package a1007;

abstract class Unit1 {
	int x, y;
	abstract void move(int x, int y);
	void stop(){}
		
}
class Marine1 extends Unit1{
	void move(int x, int y){
		System.out.println(x+y);
	}
	
	void stimPack(){}
}

class Tank1 extends Unit1{
	void move(int x, int y){}
	
	void changeMode(){}
}

class Dropship1 extends Unit1{
	void move(int x, int y){}
	void load(){}
	void unload(){}

}
public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
