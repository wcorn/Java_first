package class02;

public class Test {
	public static void main(String[] args) {
		Customer customer = new Customer(10010,"lejien");
		customer.bonusPoint = 1000;
		System.out.println(customer.ShowInfo());
		VIPCustomer Kim = new VIPCustomer(10020,"IU");
		Kim.bonusPoint = 1000;
		System.out.println(Kim.ShowInfo());
		Customer vc = new VIPCustomer(12345,"NO");
		System.out.println(vc.ShowInfo());
 	}
}
