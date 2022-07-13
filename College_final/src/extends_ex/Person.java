package extends_ex;
public class Person {
	private String name;
	public Person()
	{
		name = "Not yet";
	}
	public Person(String initial)
	{
		name = initial;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void writeOutput()
	{
		System.out.println("Name = "+name);
	}
	public boolean sameName(Person other)
	{
		return this.name.equals(other.name);
	}
}
