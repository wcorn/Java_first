package class04;

public class equalsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		student st1 = new student(100,"Lee");
		student st2 = new student(100,"Lee");
		student st3 = st1;
		System.out.println(st1==st2);
		System.out.println(st1.equals(st2));
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		student copy = (student)st1.clone();
		System.out.println(copy.hashCode());
	}

}
