package class01;

public class Customer {
	protected int ID;
	protected String name;
	protected String Grade;
	int bonusPoint;
	double bonusRatio;
	public Customer() {
		Grade = "SILVER";
		bonusRatio = 0.01;
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
		return this.Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public int culcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String ShowInfo() {
		return name+"grad"+Grade+"point"+bonusPoint;
	}
}
