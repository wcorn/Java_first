package class05;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	public void setKoreaSubject(String subjectName, int score) {
		korea.subjectName = subjectName;
		korea.score = score;
	}
	public void setmathSubject(String subjectName, int score) {
		math.subjectName = subjectName;
		math.score = score;
	}
	public void showScore() {
		int total = korea.score+math.score;
		System.out.println(total);
	}
}
