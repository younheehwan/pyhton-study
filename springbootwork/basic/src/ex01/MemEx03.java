package ex01;

// int, double, char, boolean
// String
// int, String 동시에 저장하기 위한 자료형

// 클래스 자료형 => 커스텀 자료형
class Dog {
	static String name = "말티즈";
	static int age = 3;
	static String color = "하얀색";
}

public class MemEx03 {
	
	public static void main(String[] args) {
		System.out.println(Dog.name);
		System.out.println(Dog.age);
		System.out.println(Dog.color);
	}
}
