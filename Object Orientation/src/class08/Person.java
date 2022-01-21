package class08;

public class Person {
	String name;
	int age;
	public Person()
	{
		this("no name",1);	//이게 먼저 와야함
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showPerson()
	{
		System.out.println(name+","+age);
	}
	public Person gerPerson()
	{
		return this;
	}
	public static void main(String[] args)
	{
		Person person = new Person();
		person.showPerson();
		System.out.println(person);
	}
}
