package ch06_codes;


//public class Ticket {
//	private static int numTicketsSold = 0; // shared
//	private int ticketNum; // one per object
//
//	public Ticket() {
//		numTicketsSold++;
//		ticketNum = numTicketsSold;
//	}
//
//	public int getTicketNumber() { return ticketNum; }
//
//	public String getInfo(){
//		return "ticket # " + ticketNum + "; " + 
//				numTicketsSold + " ticket(s) sold.";
//	}
//}


public class Ticket {
  private static int numTicketsSold = 0; // shared
  private int ticketNum; // one per object
  
  public Ticket() {
    numTicketsSold++;
    ticketNum = numTicketsSold;
  }
  
  public static int getNumberSold() {
    return numTicketsSold;
  }
  
  public int getTicketNumber() { return ticketNum; }
  
  public String getInfo(){
    return "ticket # " + ticketNum + "; " + 
            numTicketsSold + " ticket(s) sold.";
  }
}
