package test;

public class Test {
	public static void main(String[] args) {
		Student Lee = new Student("Lee");
		Lee.addsubject("����", 100);
		Lee.addsubject("����", 50);
		Lee.showInfo();
		Student Kim = new Student("Kim");
		Kim.addsubject("����", 70);
		Kim.addsubject("����", 85);
		Kim.addsubject("����", 100);
		Kim.showInfo();
	}
}
