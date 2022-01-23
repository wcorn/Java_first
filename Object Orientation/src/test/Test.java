package test;

public class Test {

	public static void main(String[] args) {
		CarFactory Factory = CarFactory.getInstance();
		Car mySonata = Factory.createCar();
		Car yourSonata = Factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
