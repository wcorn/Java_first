package class03;

public class Test {
	public static void main(String[] args) {
		Customer Lee = new Customer(10010,"이순신");
		Lee.bonusPoint = 1000;
		int price = Lee.calcPrice(1000);
		System.out.println(Lee.ShowInfo()+price);
		
		VIPCustomer Kim = new VIPCustomer(10020,"김유신");
		Kim.bonusPoint = 10000;
		price = Kim.calcPrice(1000);
		System.out.println(Kim.ShowInfo()+price);
		
		Customer vc = new VIPCustomer(123,"NO");
		vc.calcPrice(1000);
		
		System.out.println(vc.calcPrice(1000));
 	}
}
