package class_practice;
public class Ticket {
	protected static int numticket = 0;
	int ticketnum = 0;
	public Ticket() {
		numticket++;
		this.ticketnum = numticket;
	}
	public int print() {
		return ticketnum;
	}
}
