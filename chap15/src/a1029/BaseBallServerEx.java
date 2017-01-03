package a1029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * ���� �߱����� ����
 * ������ 4�ڸ� ���ڸ� �����ϰ�
 * Ŭ���̾�Ʈ�� ���ڸ� �Է��ϸ� ��Ʈ����ũ ���� �����Ͽ� Ŭ���̾�Ʈ���� �����ϱ�
 * �������� �����̸� ��� �����带 �����Ų��.
 * ���ο� ��ȣ�� �ٽ� �����Ͽ�, Ŭ���̾�Ʈ�� ������ ���
 */
public class BaseBallServerEx {
	//���Ͽ� ����Ǿ��ִ� Ŭ���̾�Ʈ������ ������ �����մϴ� �˸�����
	static List<Writer> outs = new ArrayList<Writer>();
	//
	static List<BaseBallThread> threads = new ArrayList<BaseBallThread>(); 
	static LinkedHashSet<Integer> answer;
	
	public static void main(String[] args) throws IOException{
		//���� ���Ͽ� ��Ʈ�� �ִ� ���ε�
		ServerSocket ss = new ServerSocket(9000);
		numberSelect(); //���ڸ� ���� ����
		while(true){
			Socket s = ss.accept();
			System.out.println("Ŭ���̾�Ʈ : " + s.getInetAddress());
			List<Integer> arr = new ArrayList<Integer>(answer); //�迭�� ��������� �ٲ�
			outs.add(new OutputStreamWriter(s.getOutputStream()));//���Ŭ���̾�Ʈ���� ������ �޾�
			BaseBallThread bt = new BaseBallThread(s, arr);
			threads.add(bt);
			bt.start();
		}
	}
	static void numberSelect(){
		answer = new LinkedHashSet<Integer>();
		int data;
		while(answer.size()<4){
			data = (int)(Math.random()*10);
			answer.add(data);
		}
		System.out.println(answer);
	}

}
class BaseBallThread extends Thread{
	Socket s;
	List<Integer> answer;
	boolean able = true;
	BaseBallThread(Socket s, List<Integer> answer){
		this.s = s;
		this.answer = answer;
	}
	public void run(){
		BufferedReader br = null;
		Writer bw = null;
		String number = null;
		try{
			//Ŭ���̾�Ʈ�� ����Ǿ� �ִ� ��Ʈ��
			br = new BufferedReader(new InputStreamReader(s.getInputStream())); 
			bw = new OutputStreamWriter(s.getOutputStream());
		}catch(IOException e){
			e.printStackTrace();
		}
		while(able){
			try{
				number = br.readLine();
			}catch(IOException e){
				e.printStackTrace();
			}
			char[] carr = number.toCharArray(); //������ �迭
			int rcvData[] = new int[4];
			for(int i=0; i<carr.length;i++)
				rcvData[i] = carr[i] - '0';
			int strike = 0;
			int ball =0;
			int i, j;
			for(i=0; i<rcvData.length; i++){
				for(j=0; j<rcvData.length; j++){
					if(rcvData[i] == answer.get(j)){
						if(i==j)strike++;
						else ball++;
					}
				}
			}
			try{
				if(strike ==4){
					bw.write(number + "�����Դϴ�. ������ �����մϴ�.\n");
					bw.flush();
					allClientClose();
					break;
				}else{
					bw.write(number + " : " + strike + "��Ʈ����ũ, " + ball + " ��\n");
					bw.flush();
				}
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
	private void allClientClose(){
		Iterator<Writer> list = BaseBallServerEx.outs.iterator();
		BaseBallServerEx.numberSelect();
		
		while (list.hasNext()){
			Writer w = list.next();
			try{
				w.write("�ٸ� ����ڰ� �̰���ϴ�. ������ �����մϴ�.\n");
				w.flush();
				list.remove(); // ������ ������ ������
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		//BaseBallServerEx.outs.clear(); //�Ѳ����� ����� ������
		for(BaseBallThread t : BaseBallServerEx.threads){
			t.able = false; //run()�޼��� �ڵ����� ����
			//������ ���� : stop() �޼����ִµ� ���Ұ� �޼���� �����Ǿ 
		}
		BaseBallServerEx.threads.clear(); //�������ִ� ��������� Ŭ����
	}
}
