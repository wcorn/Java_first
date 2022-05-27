package ch10_codes;
import java.io.*;
import java.util.*;
public class FileWrite {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String fileName = "out.txt";
		PrintWriter outputStream = null;
		try
		{
			outputStream = new PrintWriter(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file "+fileName);
			System.exit(0);
		}
		System.out.println("Enter three lines of text");
		for(int count=1;count<=3;count++)
		{
			String line = sc.nextLine();
			outputStream.println(count+" "+line);
		}
		outputStream.close();
		System.out.println("Those line were written to "+fileName);
	}

}
