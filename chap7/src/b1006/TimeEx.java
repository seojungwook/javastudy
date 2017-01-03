package b1006;

public class TimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		t.setHour(10);
		t.setMinute(3);
		t.setSecond(50);
		System.out.println(t.getTime());
	//	t.hour=(500);//접근제어자 오류
		t.setTime(12,10,50);
		System.out.println(t.getTime());
	}

}
