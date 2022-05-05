import java.util.*;
public class Ex4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberofStudent;
		double sum;
		String answer;
		double next;
		do
		{
			System.out.println("Enter all the scores to be averaged");
			System.out.println("Enter a negative number after");
			System.out.println("you have entered all the scores");
			sum = 0;
			numberofStudent = 0;
			next = sc.nextDouble();
			while(next>=0) {
				sum = sum+ next;
				numberofStudent++;
				next = sc.nextInt();
			}
			System.out.println("The average is "+sum/numberofStudent);
			System.out.println("Want to acerage another exam?");
			System.out.println("Enter yes or no.");
			answer = sc.next();
		}
		while(answer.equalsIgnoreCase("yes"));
		sc.close();
	}

}
