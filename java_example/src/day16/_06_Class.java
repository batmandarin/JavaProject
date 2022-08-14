package day16;

import java.util.Scanner;

public class _06_Class {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println(mc.getNum());
	}
}

class MyClass{
	//생성자 : 객체화시 사용되는 메서드
	MyClass(){
		//생성하는 클래스와 동일한 이름을 갖고있는 메서드이다
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자의 값은 ? ");
		int num = sc.nextInt();
		setNum(num);
	}
	//메서드 : 클래스 안에 있는 함수
	//접근 권한 제어자 : pretend, default, protected, public
	//변수는 private, 메서드는 public, 상속이 필요할때만 private을 protected로
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	//모든 메서드에는 클래스를 지정하는 this가 숨겨져 있다
	public void go(MyClass this) {
		this.getNum();
		this.setNum();
		this.num;
	}
}
