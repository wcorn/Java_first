package class04;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {}
	public Student(int studentNumber,String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	public String showStudentInfo() {
		return studentName+"학생의학번은"+studentNumber+"학점은"+grade;
	}
}
