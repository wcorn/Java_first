package class01;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		Grade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}
	public int getAgentID() {
		return agentID;
	}
}
