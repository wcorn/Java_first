package class_practice;
public class Provider {
	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		System.out.println(t1.print());
		System.out.println(t2.print());
		System.out.println(Ticket.numticket);
	}
}