package test;
import java.util.ArrayList;

public class Student {
	private static int serialNum = 1000;
	private int num;
	ArrayList<Subject> subjectList;
	String name;
	String subjectName;
	int subjectScore;
	public Student(String name) {
		this.name = name;
		serialNum++;
		num = serialNum;
		
		subjectList = new ArrayList<Subject>();
	}
	public int getNum() {
		return num;
	}
	public void addSubject(String subjectName,int subjectScore) {
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		subjectList.add(subject);
	}
	public void show() {
		for(int i =0; i<subjectList.size();i++) {
			System.out.println(subjectList.get(i).getSubjectName()+subjectList.get(i).getSubjectScore());
		}
	}
}
