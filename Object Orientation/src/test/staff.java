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
	return "�̸��� "+staffName+" ���̴� "+staffAge+" ���̵�� "+staffID;
	}
}
