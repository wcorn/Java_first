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
		System.out.println(subwayNumber+"���� �°� ���� " + subwayMember+"���̰� ������"+money);
	}
}
