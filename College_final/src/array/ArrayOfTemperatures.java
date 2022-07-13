package array;

import java.util.Scanner;

public class ArrayOfTemperatures {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 7 temperatures:" );
		double[] temp = new double[7];
		double sub=0;
		for(int i=0;i<7;i++)
		{
			temp[i] = sc.nextDouble();
			sub+=temp[i];
		}
		System.out.println(sub/7);
		for(double i:temp) {
			System.out.println(i);
		}
	}

}
