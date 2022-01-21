package class09;

public class Student {
	String name;
	int haveMoney;
	public Student()
	{
	}
	public Student(String name, int haveMoney)
	{
		this.name = name;
		this.haveMoney = haveMoney;
	}
	public void takeBus(Bus bus)
	{
		bus.take(1000);
		this.haveMoney-=1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.haveMoney -=1200;
	}
	
	public void showInfo()
	{
		System.out.println(name+"³²Àºµ· : "+haveMoney);
	}
}

