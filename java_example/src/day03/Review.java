package day03;

public class Review {	
	public static void main(String[] args) {
		// 출력 syso
		System.out.println("큰따옴표 열고 쓰고싶은 말 쓰기");
		System.out.println("실행은 ctrl누른채로 F11");
		
		//변수
		String 문자열 = "Run";
		int 정수 = 0;  //int double이 안되는 이유 : 정수와 실수를 맞물릴 수 없기 때문
		double 실수 = 0.0;
		boolean 명제 = false;
		//자료형 변수명;
		//변수는 저장 공간
		
		//변수 사용 : 변수 안에 저장된 데이터를 사용
		System.out.println(문자열+"실행은 Ctrl누른채로 F11");
		
		//if(){} : 상황에 따라서 동작을 다르게 하기 위해
		if(정수 > 0) {
			System.out.println("정수는 양수입니다.");
			//정수에 있는 데이터는 0보다 크지 않기 때문에 이 부분은 무시
		}else if(정수 == 0) {
			System.out.println("정수는 0입니다.");
			//정수에 들어있는 데이터가 0일 때만 실행
		}else {
			//if와 else if가 모두 해당하지 않을 경우 실행
			System.out.println("정수는 음수입니다.");
			//첫번째 else if에서 실행했기 때문에 여기까지 오진 않음 
		}
		
		//
	}

}
