package student_management;

public class Student_Score_Demo {

	public static void main(String[] args) {
		Student IU = new Student("IU");
		IU.add_subject("Math", 3);
		IU.add_subject("English", 3);
		IU.print_subject();
		IU.add_subject("Math", 3);
	}

}
