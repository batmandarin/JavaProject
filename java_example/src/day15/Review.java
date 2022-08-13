package day15;

public class Review {
	public static void main(String[] args) {
		//스레드 : 실행 중인 프로그램=프로세스 내부에서 실질적으로 업무 수행을 하는 단위
		
		//main() 함수는 기본적으로 메인 스레드를 갖고있음(저번에 숫자1 곱처럼 생략되어있다 한 그 기능)
		MyThread1 mt1 = new MyThread1();  //스레드 상속
		MyThread2 mt2 = new MyThread2();  //러너블 상속
		Thread mtt2 = new Thread(mt2);    //자바는 이중 상속이 불가
		
		mt1.start();   //run 메서드의 내용이 추가 스레드로 실행이 됨
		mtt2.start();   //스타트는 스레드에 있어야지 임플리먼트에 있는건 아니라 여기선 스타트 입력 불가
	}
}
//추가 스레드를 만드는 이유 : 메인 스레드와는 별개로 동작하기 위해서 추가 스레드를 만드는 것(메인에 관해서) -스레드로 클래스를 상속받아서 runn등으로 구현할 수 있음 -> 메인에서 스타트 실행
class MyThread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("추가스레드1");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception catch block
				e.printStackTrace();
			}
		}
			
	}
}

//추가 스레드2
class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("추가스레드2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception catch block
			}
		}
	}
}
