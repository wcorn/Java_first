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
		System.out.println(name+" ������ "+money+"�� �Դϴ�.");
		
	}
}
