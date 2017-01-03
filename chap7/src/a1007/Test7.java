package a1007;
class MyTv2{
private boolean isPowerOn;
private int channel;
private int volume;

/*
 * setter
 * 		void setChannel(int c) {channel = c;}
 * getter : 리턴타입 channel의 자료형과 같다
 * 		int getChannel() {return channel;}
 */
private int prevChannel;


final int MAX_VOLUME = 100;
public boolean isPowerOn() {
	return isPowerOn;
}


public void setPowerOn(boolean isPowerOn) {
	this.isPowerOn = isPowerOn;
}


public int getChannel() {
	return channel;
}


public void setChannel(int channel) {
	this.channel = channel;
}


public int getVolume() {
	return volume;
}


public void setVolume(int volume) {
	this.volume = volume;
}


public int getPrevChannel() {
	return prevChannel;
}


public void setPrevChannel(int prevChannel) {
	this.prevChannel = prevChannel;
}


final int MIN_VOLUME = 0;
final int MAX_CHANNEL = 100;
final int MIN_CHANNEL = 1;


void gotoPrevChannel(){
	int t = channel;
	channel = prevChannel;
	prevChannel = t;
}
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH : "+ t.getChannel());
//		t.setVolume(20);
//		System.out.println("VOL : " + t.getVolume());
		t.setChannel(20);
		System.out.println("CH : "+ t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}

}
