package test;

class MyPoint {
	int x,y;
	public MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}


double getDistance(int x, int y){
	return Math.sqrt
			((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
}
	
}
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyPoint p = new MyPoint(1,1);
			System.out.println(p.getDistance(2, 2));
	}

}
