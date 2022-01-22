package test;

import java.util.Scanner;
public class Test {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		People E = new People("Edward",20000);
		Taxi T = new Taxi("잘나간다 운수");
		E.TakeTaxi(T, 10000);
		
		E.Show();
		T.show();
	}
}