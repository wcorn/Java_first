package car;

public class Car {
	private static int num = 10000;
	private int ID;
	public Car()
	{
		num++;
		ID = num;
	}
	public int get_ID()
	{
		return ID;
	}
}
