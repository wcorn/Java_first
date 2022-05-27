package Play;
public class Customer {
	static private int Count = 1000; 
	private int ID =0;
	private String name;
	private int age;
	private String Grade;
	private int nestedmoney=0;
	private int SalesRatio;
	private String Agent;
	public Customer()
	{
		Count++;
		ID = Count;
	}
	public Customer(String name,int age)
	{
		Count++;
		ID = Count;
		this.name = name;
		this.age = age;
	}
	public int get()
	{
		return ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public void addUseMoeny(int money)
	{
		nestedmoney+=money;
	}
	public int getMoney()
	{
		return nestedmoney;
	}
	public void showInfo()
	{
		System.out.println("Name = "+name+"\nAge = "+age+"\nGrade = "+Grade);
	}
}
