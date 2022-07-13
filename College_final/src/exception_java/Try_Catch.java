package exception_java;

import java.util.Scanner;

public class Try_Catch {
	public static void main(String[] args) {
		int marks[] = { 40, 50, 60 };
		System.out.println("Hello 1");
		try
		{
		int m1 = marks[3];
		System.out.println("Marks are " + m1);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Do not cross size of array sir. " + e );
		}
		System.out.println("Hello 2");
		System.out.println("Hello 3x");
	}

}
