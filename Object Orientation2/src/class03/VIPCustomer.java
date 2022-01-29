package class03;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double salesRatio;
	
//	public VIPCustomer() {
//		super(0,"no-name");
//		Grade = "VIP";
//		salesRatio = 0.1;
//		bonusRatio = 0.05;
//		System.out.println("VIP»£√‚");
//	}
	public VIPCustomer(int ID, String name) {
		super(ID, name);
		Grade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		price -=(int)(price*salesRatio);
		return price;
	}
	
	public int getAgentID() {
		return agentID;
	}
}
