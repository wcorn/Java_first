package class09;

public class Subway {
	int subwayNumber;
	int subwayMember;
	int money;
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	public void take(int money)
	{
		this.money +=money;
		subwayMember++;
	}
	
	public void showBusInfo() {
		System.out.println(subwayNumber+"번의 승객 수는 " + subwayMember+"명이고 수입은"+money);
	}
}
