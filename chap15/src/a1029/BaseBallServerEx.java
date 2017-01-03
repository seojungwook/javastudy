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
 * 숫자 야구게임 서버
 * 임의의 4자리 숫자를 지정하고
 * 클라이언트가 숫자를 입력하면 스트라이크 볼을 결정하여 클라이언트에게 전송하기
 * 누군가가 정답이면 모든 스레드를 종료시킨다.
 * 새로운 번호를 다시 지정하여, 클라이언트의 접속을 대기
 */
public class BaseBallServerEx {
	//소켓에 연결되어있는 클라이언트들한테 게임을 종료합니다 알리려고
	static List<Writer> outs = new ArrayList<Writer>();
	//
	static List<BaseBallThread> threads = new ArrayList<BaseBallThread>(); 
	static LinkedHashSet<Integer> answer;
	
	public static void main(String[] args) throws IOException{
		//서버 소켓에 포트를 넣는 바인딩
		ServerSocket ss = new ServerSocket(9000);
		numberSelect(); //네자리 숫자 저장
		while(true){
			Socket s = ss.accept();
			System.out.println("클라이언트 : " + s.getInetAddress());
			List<Integer> arr = new ArrayList<Integer>(answer); //배열로 만들기위해 바꿈
			outs.add(new OutputStreamWriter(s.getOutputStream()));//모든클라이언트들이 데이터 받아
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
			//클라이언트와 연결되어 있는 스트림
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
			char[] carr = number.toCharArray(); //문자형 배열
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
					bw.write(number + "정답입니다. 게임을 종료합니다.\n");
					bw.flush();
					allClientClose();
					break;
				}else{
					bw.write(number + " : " + strike + "스트라이크, " + ball + " 볼\n");
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
				w.write("다른 사용자가 이겼습니다. 게임을 종료합니다.\n");
				w.flush();
				list.remove(); // 일일이 지워서 날린거
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		//BaseBallServerEx.outs.clear(); //한꺼번에 지운고 날린거
		for(BaseBallThread t : BaseBallServerEx.threads){
			t.able = false; //run()메서드 자동으로 종료
			//스레드 종료 : stop() 메서드있는데 사용불가 메서드로 지정되어서 
		}
		BaseBallServerEx.threads.clear(); //가지고있던 스레드까지 클리어
	}
}
