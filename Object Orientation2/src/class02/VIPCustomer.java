package class02;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double salesRatio;
	
//	public VIPCustomer() {
//		super(0,"no-name");
//		Grade = "VIP";
//		salesRatio = 0.1;
//		bonusRatio = 0.05;
//		System.out.println("VIPȣ��");
//	}
	public VIPCustomer(int ID, String name) {
		super(ID, name);
		Grade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		
		System.out.println("VIP");
	}

	
	public int getAgentID() {
		return agentID;
	}
}
