package test;

public class staff {
	public String staffName;
	public int staffAge;
	public int staffID;
	
	public staff() {};
	public staff(String staffName, int staffAge,int staffID) {
		this.staffAge = staffAge;
		this.staffName = staffName;
		this.staffID = staffID;
	}
	public String staffInfo() {
	return "이름은 "+staffName+" 나이는 "+staffAge+" 아이디는 "+staffID;
	}
}
