package class03;

public class Customer {
	protected int ID;
	protected String name;
	protected String Grade;
	int bonusPoint;
	double bonusRatio;
	/*public Customer() {
		Grade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 호출");
	}*/
	public Customer(int ID,String name) {
		this.ID = ID;
		this.name = name;
		Grade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 호출");
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String ShowInfo() {
		return name+"님 등급"+Grade+"포인트"+bonusPoint;
	}
}
