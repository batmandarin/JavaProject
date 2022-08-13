package day15;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class Socket1 {
	public static void main(String[] args) {
		MyServer ms = new MyServer();
		MyClient mc = new MyClient();
		
		//ms.go(15000);   //내 컴퓨터 IP에 15000번을 통해서 연락
		//이 주석에 현재 컴퓨터 IP 적기 : 
		mc.go("192.168.1.1", 15000);
	}
}

class MyServer{
	//서버
	InputStream is;
	OutputStream os;
	ServerSocket serverSocket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket socket;
	
	public void go(String in, int port) {
		try {
		serverSocket = new ServerSocket(15000);
		while(true) {
			System.out.println("요정 대기");
			socket = serverSocket.accept();   //accept  : 유저 접속을 기다리는 메서드
			socket = new Socket(in, port);
			System.out.println("접속 IP : "+socket.getInetAddress());
			is = socket.getInputStream();
			os = socket.getOutputStream();
			ois = new ObjectInputStream(is);   //통신을 위한 추가처리
			oos = new ObjectOutputStream(os);  //통신을 위한 추가처리
			String msg = (String)ois.readObject();    //메시지 수신
			System.out.println("클라이언트의 메시지 : "+msg);
			
			String respon = "서버가 준 메시지 : "+msg;
			oos.writeObject(respon);    //메시지 송신
			socket.close();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
//유저

class MyClient{
	InputStream is;
	OutputStream os;
	ServerSocket serverSocket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket socket;
	Scanner sc = new Scanner(System.in);
	private String msg = null;
	
	public void go(String ip, int port) {
		try {
		socket = new Socket(ip, port);
		os = socket.getOutputStream();
		oos = new ObjectOutputStream(os);
		
		System.out.println("보낼 메시지 >> ");
		String msg = sc.next();
		oos.writeObject(msg);
		
		is = socket.getInputStream();
		ois = new ObjectInputStream(is);
		String server_msg = (String)ois.readObject();
		System.out.println(server_msg);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}