package a1021;
/*
 * ������ ������ �Һ��� ������ ����
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
	//�Һ��ڽ����尡 ȣ���ϴ� �޼���
	public synchronized String getData(){
		//������ data�� ����. => �Һ��ڽ����� wait()
		while(data == null){
			try{
				wait(); //notify()�޼��� ȣ��ñ��� ��� wait()
			}catch(InterruptedException e){}
		}
		//notify()�� ����
		String value = data;
		System.out.println("Consummer �����尡 ���� �� : " + value);
		data= null;
		notify(); // wait()���¿� �ִ� ������ �����尡 ���డ�ɻ��·�
		return value;
	}
	//������ �����尡 ȣ���ϴ� �޼���
	public synchronized void setData(String data){
		while(this.data != null){
			try{
				wait(); //�����ڽ����� wait()
			}catch(InterruptedException e){}
		}
		this.data = data;
		System.out.println("Producer �����尡 ������ ������: " + data);
		notify(); //�Һ��ڽ����尡 ���డ�ɻ��·� ����
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

