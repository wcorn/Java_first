package test;

public class Test {
	public static void main(String[] args) {
		Student Lee = new Student("Lee");
		Lee.addsubject("국어", 100);
		Lee.addsubject("수학", 50);
		Lee.showInfo();
		Student Kim = new Student("Kim");
		Kim.addsubject("국어", 70);
		Kim.addsubject("수학", 85);
		Kim.addsubject("영어", 100);
		Kim.showInfo();
	}
}
