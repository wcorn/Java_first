package class10;

public class Employee {
	
	private static int serialNum =1000;
	
	int Id;
	private String name;
	private String department;
	public Employee()
	{
		serialNum++;
		Id = serialNum;
	}
	public static int getSerialNum() {
		int i=0;
		return serialNum;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
