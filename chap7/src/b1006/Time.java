package b1006;

public class Time {
	private int hour;
	private int minute;
	private int second;
	public void setHour(int h){
		if(h<0 || h>23) return;
		hour = h;
	}
	public void setMinute(int m){
		if(m<0 || m>59) return;
		minute = m;
	}
	public void setSecond(int s){
		if(s<0 || s>59) return;
		second = s;
	}
	public String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	protected void setTime(int h, int m, int s){
		setHour(h); setMinute(m); setSecond(s);
	}
}
