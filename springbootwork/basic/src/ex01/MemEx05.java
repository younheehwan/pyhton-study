package ex01;

public class MemEx05 {
	
	static int num = 10;
	int num2 = 20;
	
	// void는 리턴하지 않는다.
	// add는 함수이름
	static void add() {
		//System.out.println(num2);
		System.out.println("더하기");
	}
	
	void minus() {
		System.out.println(num);
		System.out.println("빼기");
	}
	
	public static void main(String[] args) {
		MemEx05 m5 = new MemEx05();
		m5.minus();
		add();
	}
}
