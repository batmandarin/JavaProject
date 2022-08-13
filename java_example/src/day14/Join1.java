package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Join1 {
	static ArrayList<String> arrList = new ArrayList<>();  //static을 붙이면 객체화없이 접근 가능(실행 금지)
	public static void main(String[] args) {
		InitClass it = new InitClass();
		AfterClass ac = new AfterClass();
		
		it.start();
		
		//스레드를 따로 작동시켜도 순번을 정해줄 수 있다 join
		try {
			it.join();
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ac.start();
	}
}

class InitClass extends Thread{
	//현재 해줘야할 클래스
	ArrayList<String> arrList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	private String ss;
	@Override
	public void run() {
		while(true) {
			ss= sc.nextLine();
			if(ss.equals("0"))
				break;
			
			Join1.arrList.add(ss);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class AfterClass extends Thread{
	//나중에 해줘야할 클래스
	@Override
	public void run() {
		System.out.println("그 다음 스레드 시작");
		for (int i = 0; i < Join1.arrList.size(); i++) {
			System.out.println(Join1.arrList.get(i));
		}
		System.out.println("그 다음 스레드 끝");
	}
}