package class04;

public class Test {
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		Student  studentKim = new Student(12345,"kim",3);
		System.out.println(studentKim.showStudentInfo());
	}
}