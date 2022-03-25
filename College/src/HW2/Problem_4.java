package HW2;
import java.util.*;
public class Problem_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter price of item");
		System.out.print("(from 25 cent to a dollar, in 5-cent increments): ");
		//cent 입력
		int cent = sc.nextInt();
		//거스름돈
		int change = 100-cent;
		//쿼터 계산 및 거스름돈에서 제거
		int quarters = change/25;
		change%=25;
		//디엠 계산 및 거스름돈에서 제거
		int diems = change/10;
		change%=10;
		//니켈 계산
		int nickel = change/5;
		System.out.println("\nYou bought an item for "+ cent+" cents and gave me a dollar,");
		System.out.println("so yoyr change is");
		System.out.println(quarters+" quarters");
		System.out.println(diems+" diems, and");
		System.out.println(nickel+ " nickel.");
	}

}
