package ch06_codes;

//public class TicketDemo {
//	public static void main(String[] args) {
//
//		Ticket t1 = new Ticket();
//		System.out.println(t1.getTicketNumber());
//
//		Ticket t2 = new Ticket();
//		System.out.println(t2.getTicketNumber());
//
//		System.out.println(t1.getInfo());
//		System.out.println(t2.getInfo());
//	}
//}


public class TicketDemo {
	public static void main(String[] args) {
		System.out.println(Ticket.getNumberSold());

		Ticket t1 = new Ticket();
		System.out.println(Ticket.getNumberSold());

		Ticket t2 = new Ticket();
		System.out.println(Ticket.getNumberSold());
		System.out.println(t2.getInfo());
		System.out.println(t1.getInfo());

//		System.out.println(Ticket.getNumberSold());
	}
}
