package test_1;
public class Taxi {
	public int money;
	public String name;
	
	public Taxi(String name) {
		this.name = name;
	}
	public void take(int money) {
		this.money+=money;
	}
	public String show() {
		return name+ " 수입은 "+money+"원 입니다";
	}
}
