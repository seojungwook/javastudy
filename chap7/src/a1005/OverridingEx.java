package a1005;
/*
 * 238p 오버로딩과 오버라이딩 차이
 * 
 * 오버라이딩 예제
 * 	오버라이딩이란 : 부모클래스의 메서드를 재정의하는 것이다.
 * 	오버라이딩조건 : 부모클래스의 메서드의 선언부와 자손클래스의 메서드의 선언부(접근제어자, 리턴타입, 메서드이름, 매개변수)가 같아야 한다.
 * 			단, 접근제어자는 부모보다 넓은 범위로는 가능하다. 부모메서드의 접근제어자가 default면 
 * 											자손 메서드는 default, protected, public 허용 
 *											부모메서드의 접근제어자가 protected이면
 * 											자손 메서드는 protected, public 허용
 * 											부모메서드의 접근제어자가 public이면
 * 											자손 메서드는 public 허용
 * 											
 * 											단 예외처리는 좁은 범위로는 가능하다.
 */
class Point {
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation(){
		return "x:" + x +", y:"+ y ;
	}
	
}

class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		super(x,y); // 부모를 먼저 초기화할거니 무조건 첫 줄
//		this.x = x; super를 선언하면 필요 없어
//		this.y = y;
		this.z = z;
	}
	//오버라이딩된 메서드
	@Override // 어노테이션@@@, 이것의 기능은 올바르게 오버라이딩된 메서드인지 검증
	String getLocation(){
		return "x:" + x +", y:"+ y + ", z:"+z;
	}
}
public class OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3= new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}

}
