package class09;

public class Bus {
	int busNumber;
	int busMember;
	int money;
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money)
	{
		this.money +=money;
		busMember++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"���� �°� ���� " + busMember+"���̰� ������"+money);
	}
}
