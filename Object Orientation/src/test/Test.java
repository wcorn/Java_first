package test;

public class Test {
	public static void main(String[] args) {
		Student Lee = new Student("Lee");
		Lee.addSubject("국어", 100);
		Lee.addSubject("수학", 70);
		Lee.show();
	}
}
