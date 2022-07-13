 package extends_ex;

public class Student extends Person{
	private int studentNumber;
	public Student()
	{
		super();
		studentNumber = 0;
	}
	public Student(String name, int number)
	{
		super(name);
		studentNumber = number;
	}
	public void reset (String newName, int newStudentNumber)
	{
		setName(newName);
		studentNumber = newStudentNumber;
	}
	public int getStudentNumber()
	{
		return studentNumber;
	}
	public void setStudentNumber(int newStudentNumber)
	{
		studentNumber = newStudentNumber;
	}
	@Override
	public void writeOutput()
	{
		System.out.println("Name = "+getName());
		System.out.println("Student Number = "+studentNumber);
	}
	
	public boolean equals (Student otherStudent)
	{
		return this.sameName(otherStudent)&&(this.studentNumber==otherStudent.studentNumber);
	}
}
