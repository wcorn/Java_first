package test;

public class Taxi {
	String name;
	int money;
	public Taxi(String name) {
		this.name = name;
	}
	public void take(int pay)
	{
		money+=pay;
	}
	public void show()
	{
		System.out.println(name+" 수입은 "+money+"원 입니다.");
		
	}
}
