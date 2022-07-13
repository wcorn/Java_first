package extends_ex;
public class Undergraduate extends Student{
	private int  level;
	public Undergraduate()
	{
		super();
		level = 1;
	}
	public Undergraduate(String StudentName, int studentNumber, int level)
	{
		super(StudentName,studentNumber);
		setLevel(level);
	}
	public int getLevel()
	{
		return level;
	}
	public void setLevel(int newLevel) {
		if((1<=newLevel)&&newLevel<=4)
		{
			level = newLevel;
		}
		else
		{
			System.out.println("Illegal level");
			System.exit(0);
		}
	}
	public void reset(String newName, int newStudentNumber,int newLevel)
	{
		super.reset(newName, newStudentNumber);
		setLevel(newLevel);
	}
	@Override
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Student Level = "+level);
	}
	public boolean equals(Undergraduate otherUndergraduate)
	{
		return equals((Student) otherUndergraduate) &&	(this.level == otherUndergraduate.level);
	}
}
