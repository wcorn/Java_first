package test;

public class Student {
	int studentID;
	int total=0;
	String studentName;
	Subject sub;
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		sub = new Subject();
	}
	void setSub(String subjectName, int score) {
		sub.subjectName = subjectName;
		sub.score = score;
	}
	int totalSocre() {
		total += sub.score;
		return total;
	}
}
