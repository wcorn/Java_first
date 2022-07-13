package car;

public class CarFactoryTest {
	public static void main(String[] args)
	{
		CarFactory fac = new CarFactory();
		Car sos = fac.createCar();
		Car EOE = fac.createCar();
		System.out.println(sos.get_ID()+"\n"+EOE.get_ID()); 	
	}
}
