package test;

public class Person {
	String name;
	int money;
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	public void takeTaxi(Taxi taxi, int pay)
	{
		money-=pay;
		taxi.take(pay);
	}
	public void show()
	{
		System.out.println(name+"님의 남은 돈은 "+money+"원 입니다.");
	}
}
