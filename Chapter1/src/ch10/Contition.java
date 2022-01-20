package ch10;
import java.util.Scanner;
public class Contition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		System.out.println("첫번째 수");
		int num1 = sc.nextInt();
		System.out.println("두번째 수");
		int num2 = sc.nextInt();
		max = (num1>num2)?num1:num2;
		System.out.println(max);
		System.out.println(max>>=1);
		int num = switch(max) {
			case 2->
				4;
			case 4->
				2;
			default ->
				0;
			};
		System.out.println("결과"+num);
		for(; max<max+10;max++)
		{
			if(max>10)break;
			if(max==7)continue;
			System.out.println(max);
		}
	}
}
