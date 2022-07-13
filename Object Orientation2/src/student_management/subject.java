package student_management;

public class subject {
	private String name;
	private int credit;
	public subject(String name, int credit )
	{
		this.name = name;
		this.credit = credit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
}
