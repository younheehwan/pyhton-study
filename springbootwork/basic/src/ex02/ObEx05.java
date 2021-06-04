package ex02;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Zealot {
	private int attack = 10;
	private int hp = 100;
	
	// 객체의 초기화 용도
//	public Zealot(int attack, int hp) {
//		this.attack = attack;
//		this.hp = hp;
//	}
}

public class ObEx05 {
	public static void main(String[] args) {
		Zealot z1 = new Zealot(10, 50); // 50
		Zealot z2 = new Zealot(10, 80); // 80
		
		System.out.println(z1);
		System.out.println(z2);
	}
}
