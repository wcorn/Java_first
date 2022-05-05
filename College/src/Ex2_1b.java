import java.util.Scanner;
public class Ex2_1b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double F = sc.nextDouble();
		System.out.println("F = "+F+"\nC = "+5.0*(F-32.0)/9.0);
		sc.close();
	}
}