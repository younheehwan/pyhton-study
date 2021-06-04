package ex01;

class Cat {
	String name = "고양이";
	int age = 5;
}

public class MemEx04 {
	public static void main(String[] args) {
		Cat c1 = new Cat(); //heap 영역에 Cat 클래스가 가지고 있는 static이 아닌 모든 것들을 메모리에 로드해라.
		System.out.println(c1.name);
		System.out.println(c1.age);
	}
}
