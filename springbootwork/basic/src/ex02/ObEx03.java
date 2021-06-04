package ex02;

class Car {
	private int power = 5000;
	private String name = "BMW";
	private int oil =3;
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getOil() {
		return oil;
	}
	public void setOil(int oil) {
		this.oil = this.oil + oil;
	}
	
}

public class ObEx03 {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.setOil(5);
		System.out.println(c.getOil());
	}
}
