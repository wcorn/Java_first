package test;

public class People {
	String name;
	int money;
	public People(String name,int money)
	{
		this.name = name;
		this.money = money;
	}
	public void TakeTaxi(Taxi taxi,int pay)
	{
		taxi.take(pay);
		money-=pay;
	}
	public void Show()
	{
		System.out.println(name+"���� ���� ���� "+money+"�� �Դϴ�."); 
	}
}
