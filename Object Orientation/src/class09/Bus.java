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
		System.out.println(busNumber+"번의 승객 수는 " + busMember+"명이고 수입은"+money);
	}
}
