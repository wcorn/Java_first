package class02;

public class Test {
	public static void main(String[] args) {
		Customer customer = new Customer(10010,"�̼���");
//		customer.setName("�̼���");
//		customer.setID(10010);
		customer.bonusPoint = 1000;
		System.out.println(customer.ShowInfo());
		VIPCustomer Kim = new VIPCustomer(10020,"������");
//		Kim.setName("������");
//		Kim.setID(10020);
		Kim.bonusPoint = 10000;
		System.out.println(Kim.ShowInfo());
		
		Customer vc = new VIPCustomer(123,"NO");
		int num = vc.bonusPoint;
		System.out.println(num);
 	}
}
