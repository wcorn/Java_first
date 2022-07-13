package class04;

public class student implements Cloneable{
	private int num;
	private String name;
	public student(int num,String name)
	{
		this.num = num;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return num+","+name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof student)
		{
			student std = (student)obj;
			if(this.num == std.num)
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return num;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
