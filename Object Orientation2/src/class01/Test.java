package class01;

public class Test {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("�̼���");
		customer.setID(10010);
		customer.bonusPoint = 1000;
		System.out.println(customer.ShowInfo());
		VIPCustomer Kim = new VIPCustomer();
		Kim.setName("������");
		Kim.setID(10020);
		Kim.bonusPoint = 10000;
		System.out.println(Kim.ShowInfo());
 	}
}
