package test;

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100; //���
	final int MIN_VOLUME = 0; 	//���
	final int MAX_CHANNEL = 100;//���
	final int MIN_CHANNEL = 1;  //��� (����Ұ�)
	
	void turnOnOff(){
		if(isPowerOn) isPowerOn=false;
		else isPowerOn=true;
	}
	
	void volumeUp(){
		if(MAX_VOLUME>volume) ++volume;
	}
	
	void volumeDown(){
		if(MIN_VOLUME<volume) --volume;
	}
	
	void channelUp(){
		
		if(channel==MAX_CHANNEL) channel=MIN_CHANNEL; //�ٽ��ع�
		else ++channel;
	}
	
	void channelDown(){
		
		if(channel==MIN_CHANNEL) channel=MAX_CHANNEL; //�ٽ�
		else --channel;
	}
	
}
public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH :"+t.channel + ", VOL :"+ t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH :"+t.channel + ", VOL :"+ t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH :"+t.channel + ", VOL :"+ t.volume);
	}

}
