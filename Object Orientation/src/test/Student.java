package test;
import java.util.ArrayList;


public class Student {
	private static int SerialNum = 1000;
	private int num;
	public String name;
	private int total;
	ArrayList<Subject> SubjectList;
	public Student(String name) {
		SerialNum++;
		num = SerialNum;
		this.name = name;
		SubjectList = new ArrayList<Subject>();
	}
	public int getNum() {
		return num;
	}
	public void addsubject(String SubName, int score) {
		Subject subject = new Subject();
		SubjectList.add(subject);
		subject.setSubject(SubName);
		subject.setScore(score);
	}
	public void showInfo() {
		for(Subject s : SubjectList) {
			total += s.getScore();
			System.out.println(name+"의 "+s.getSubject()+"점수는 "+s.getScore());
		}
		System.out.println(name+"의 총점은"+total);
	}
}
