package test_1;

public class Person {
	public String name;
	public int money;
	public Person(String name, int money) {
		this.money = money;
		this.name = name;
	}
	public void takeTaxi(Taxi taxi,int money) {
		this.money -= money;
		taxi.take(money);
	}
	public String show() {
		return name+ "���� ���� ���� "+money+"�� �Դϴ�";
	}
}
