package a1007;

class Robot {}
class DanceRobot extends Robot{
	void dance(){
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot{
	void sing(){
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw(){
		System.out.println("�׸��� �׸��ϴ�.");
	}
}


public class Test18 {
	
	public static void action(Robot r){
		if(r instanceof DanceRobot){ //d��� �ϴ� ���������� ����Ű�� ��ü�� DanceRobot�̳�?
			DanceRobot d = (DanceRobot) r; 
			d.dance();
		}
		if(r instanceof SingRobot){
			SingRobot s = (SingRobot) r;
			s.sing();
		}
		if(r instanceof DrawRobot){
			DrawRobot d = (DrawRobot) r;
			d.draw();
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Robot r = new Robot();
	//	DanceRobot d = new DanceRobot();
	//	SingRobot s = new SingRobot();
	//	DrowRobot dr = new DrowRobot();
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length; i++)
			action(arr[i]);
		
		
	}

}
