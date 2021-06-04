package ex03;

//함수를 통해서 자식의 변수에 접근하기 위해
// 인터페이스 = 통로
// 1. new  할 수 없다.
// 2. 추상메서드(함수 몸체가 없음)를 가진다.
// 3. public abstract 키워드가 생략 가능하다.
// 4. implements 로 구현한다.
// 5. 함수를 오버라이드 해야하는 강제성을 부여
interface Animal {
	public abstract String getName();	
	int getHp();	
	void setHp(int hp);	
	int getAttack();	
	void setAttack(int attack);
}

//ex) Animal d1 = new Dog();
//Animal, Dog
//d1.getHp();
class Dog implements Animal {
	String name = "강이지";
	int hp = 100;
	int attack = 10;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
	@Override
	public void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}
	@Override
	public int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}
	@Override
	public void setAttack(int attack) {
		// TODO Auto-generated method stub
		this.attack = attack;
	}	
}

class Cat implements Animal {
	String name = "고양이";
	int hp = 100;
	int attack = 5;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
	@Override
	public void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}
	@Override
	public int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}
	@Override
	public void setAttack(int attack) {
		// TODO Auto-generated method stub
		this.attack = attack;
	}	
}

class Tiger implements Animal {
	String name = "호랑이";
	int hp = 100;
	int attack = 50;	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
	@Override
	public void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}
	@Override
	public int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}
	@Override
	public void setAttack(int attack) {
		// TODO Auto-generated method stub
		this.attack = attack;
	}	
}

class Cow implements Animal {
	String name = "소";
	int hp = 100;
	int attack = 20;	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}
	@Override
	public void setHp(int hp) {
		// TODO Auto-generated method stub
		this.hp = hp;
	}
	@Override
	public int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}
	@Override
	public void setAttack(int attack) {
		// TODO Auto-generated method stub
		this.attack = attack;
	}	
}

public class OverEx01 {
	// 강아지 -> 고양이
	// 고양이 -> 강아지
	static void start(Animal a1, Animal a2) {
		a2.setHp(a2.getHp() - a1.getAttack());
		System.out.println(a2.getName() + "의 hp :" + a2.getHp());
	}
	
	public static void main(String[] args) {
		Animal d1 = new Dog();
		Animal d2 = new Dog();
		Animal c1 = new Cat();
		Animal cw1 = new Cow();
		
		start(d1, c1);
		start(c1, d1);
		start(d1, d2);
		start(cw1, d1);
		start(d1, cw1);
	}
}