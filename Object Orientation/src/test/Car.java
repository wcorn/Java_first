package test;

public class Car {
	private static int serialNum = 10000;
	private int num;
	public Car() {
		serialNum++;
		num = serialNum;
	}
	public int getCarNum() {
		return num;
	}
}
