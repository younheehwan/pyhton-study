package ex02;

// 모든 클래스에는 상태(변수)가 존재한다.
// 상태는 행위를 통해서만 변경한다.
class 엘리스 {
	// 상태
	// private 같은 클래스에서만 접근 가능
	// public 모즌 패키지에서 접근 가능
	private int thirsty = 100; //목마름 지수
	
	// 행위
	void 물먹기() {
		thirsty = thirsty - 30;
	}
	
	int 목마름확인() {
		return thirsty;
	}
}

public class ObEx02 {
	public static void main(String[] args) {
		엘리스 e = new 엘리스();
		//e.thirsty = 30;
		e.물먹기();
		System.out.println(e.목마름확인());
	}
}
