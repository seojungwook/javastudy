package a1021;
/*
 * 생산자 스레드 소비자 스레드 예제
 */
class Consumer extends Thread{
	private DataBox dataBox;
	Consumer(DataBox databox){
		this.dataBox = databox;
	}
	public void run() {
		for(int i=1; i<=30; i++){
			String data = dataBox.getData();
		}
	}
}
class DataBox{
	String data;
	//소비자스레드가 호출하는 메서드
	public synchronized String getData(){
		//가져갈 data가 없다. => 소비자스레드 wait()
		while(data == null){
			try{
				wait(); //notify()메서드 호출시까지 계속 wait()
			}catch(InterruptedException e){}
		}
		//notify()된 상태
		String value = data;
		System.out.println("Consummer 스레드가 읽은 값 : " + value);
		data= null;
		notify(); // wait()상태에 있던 생산자 스레드가 실행가능상태로
		return value;
	}
	//생산자 스레드가 호출하는 메서드
	public synchronized void setData(String data){
		while(this.data != null){
			try{
				wait(); //생산자스레드 wait()
			}catch(InterruptedException e){}
		}
		this.data = data;
		System.out.println("Producer 스레드가 생성한 데이터: " + data);
		notify(); //소비자스레드가 실행가능상태로 변경
	}
}
class Producer extends Thread{
	DataBox dataBox;
	Producer(DataBox dataBox){
		this.dataBox = dataBox;
	}
	public void run(){
	
		for(int i=1; i<=30; i++){
			try{
				int sleep = (int)(Math.random()*1000);
				Thread.sleep(sleep); 
			}catch(InterruptedException e){}
			String data = "Data-" +i;
			dataBox.setData(data);
		}
	}
}
public class WaitNotifyEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBox dataBox = new DataBox();
		Producer producer = new Producer(dataBox);
		Consumer consumer = new Consumer(dataBox);
		producer.start();
		consumer.start();
	}
}

