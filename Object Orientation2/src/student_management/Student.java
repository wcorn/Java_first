package student_management;

import java.util.ArrayList;

public class Student {
	private static int Student_ID_Base = 1000;
	private int Student_ID;
	private String name;
	private ArrayList<subject> subject = new ArrayList<subject>();
	public Student(String name)
	{
		Student_ID_Base++;
		setStudent_ID(Student_ID_Base);
		this.setName(name);
	}
	public void add_subject(String subject_name, int credit)
	{
		subject sub = new subject(subject_name,credit);
		if(subject.contains(sub)) 
		{
			System.out.println("It's already here.");
		}
		else {
			subject.add(new subject(subject_name,credit));
		}
	}
	public void subtract_subject(String subject_name, int credit)
	{
		subject sub = new subject(subject_name,credit);
		if(subject.contains(sub)) 
		{
			subject.remove(sub);
		}
		else {
			System.out.println("It's don't Here");
		}
	}
	public void print_subject()
	{
		for(int i=0;i<subject.size();i++)
		{
			System.out.println("Subject name : "+subject.get(i).getName());
			System.out.println("Subject credit : "+subject.get(i).getCredit());
		}
	}
	public int getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(int student_ID) {
		Student_ID = student_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
