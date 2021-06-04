package ex03;

// 완성품
class Engine {
	
}

// 소나타
class Sonata extends Engine {
	
}


//완성품
class Burger {
	
}

// 치즈버그
class cheeseBurger extends Burger {
	
}

// 객체지향 두번째 원칙 : 상속은 다형성을 
public class OverEx02 {

	public static void main(String[] args) {
		cheeseBurger c1 = new cheeseBurger(); // cheeseBurger, Burger
		Burger c2 = new cheeseBurger();
	}

}
