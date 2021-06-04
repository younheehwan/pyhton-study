package ex03;

class Animal2 {
	String name = "동물";
	
	void sound() {
		System.out.println("무슨 소리를 내야하지?");
	}
}

class Dog2 extends Animal2 {
	String name = "강아지";
	
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat2 extends Animal2 {
	String name = "고양이";
	
	void sound() {
		System.out.println("야옹");
	}
}

public class OverEx03 {
	public static void main(String[] args) {
		// 1. 변수가 겹치면 앞에 타입을 따른다.
		Dog2 d2 = new Dog2(); // Dog2(name), Animal2(name)
		System.out.println(d2.name);
		d2.sound();
		
		Animal2 d3 = new Dog2(); // Dog2(name) => Animal2(name)
		System.out.println(d3.name);
		// 2. 부모와 자식이 동일한 함수를 가지고 있을 때, 부모의 함수를 Override(무효화) 한다.
		d3.sound();
		
		Animal2 a2 = new Animal2(); 
		a2.sound();
	}
}
