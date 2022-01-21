package class09;

public class Test {
	public static void main(String[] args)
	{
		Student J = new Student("James",5000);
		Student T = new Student("Tomas",10000);
		Bus bus100 = new Bus(100);
		J.takeBus(bus100);
		Subway subway2 = new Subway(2);
		T.takeSubway(subway2);
		J.showInfo();
		T.showInfo();
		subway2.showBusInfo();
		bus100.showBusInfo();
	}
}
