package class02;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void ShowStudentInfo() {
		System.out.println(studentID+" �̸��� "+studentName+" �ּҴ� "+address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}
