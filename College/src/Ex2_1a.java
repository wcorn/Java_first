import java.util.Scanner;
public class Ex2_1a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.println(year/1000+" "+year/100%10+" "+year/10%10+" "+year%10);
	}
}
