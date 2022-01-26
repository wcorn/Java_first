package class02;

public class Test {
	public static void main(String[] args) {
		Customer customer = new Customer(10010,"이순신");
//		customer.setName("이순신");
//		customer.setID(10010);
		customer.bonusPoint = 1000;
		System.out.println(customer.ShowInfo());
		VIPCustomer Kim = new VIPCustomer(10020,"김유신");
//		Kim.setName("김유신");
//		Kim.setID(10020);
		Kim.bonusPoint = 10000;
		System.out.println(Kim.ShowInfo());
		
		Customer vc = new VIPCustomer(123,"NO");
 	}
}
