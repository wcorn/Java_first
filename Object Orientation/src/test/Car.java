package test;

public class Car {
	private static int CarNum = 10000;
	private int num;
	public Car() {
		CarNum++;
		num = CarNum;
	}
	public int getCarNum()
	{
		return num;
	}
}
