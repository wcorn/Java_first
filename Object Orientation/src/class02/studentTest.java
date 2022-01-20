package class02;

public class studentTest {
	public static void main(String[] agrs) {
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 관악구";
		
		studentLee.ShowStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "서울 강남구";
		
		studentKim.ShowStudentInfo();
	}
}
