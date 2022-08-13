package day15;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Stream3 {
	public static void main(String[] args) {
		
	}
}

class MyProgram{
	
	Scanner st = new Scanner(System.in);
	String msg = "";
	FileOutputStream fout = null;
	
	public void go() {
		try {
			fout = new FileOutputStream("C:\\유수암쇄권.txt", true);
		}
		// 스캐너를 통해서 입력받은 문자열을
		// 바탕화면에 scan.txt
		System.out.println("내 메시지 >> ");
	    msg = st.nextLine();
	    System.out.println(msg);
	    byte[] log = msg.getBytes();
	    fout.write(log);
	}catch(Exception e) {
		e.printStackTrace();
	    System.out.println("기록 실패");
	}finally {
		try {
			
		}
	}catch (Exception e) {
		//TODO Auto-geenrated catch block
		e.printStackTrace();
	}
}

public void readText(String file) {
}