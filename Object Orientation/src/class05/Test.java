package class05;

public class Test {
	public static void main(String[] args)
	{
		Student Kang = new Student(201836101,"강동석");
		
		Kang.setKoreaSubject("Korea", 100);
		Kang.setmathSubject("math", 100);
		Kang.showScore();
		
		Student Kim = new Student(201836101,"강동석");
		
		Kim.setKoreaSubject("Korea", 80);
		Kim.setmathSubject("math", 80);
		Kim.showScore();
	}
}
