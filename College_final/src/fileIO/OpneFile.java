package fileIO;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class OpneFile {
	public static void main (String [] args)
	{
//		PrintWriter writer = null;
		Scanner sc = null;
		try {
//			writer = new PrintWriter(new FileOutputStream("dest.txt"));
			sc = new Scanner(new FileInputStream("dest.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Not found file");
			System.exit(0);
		}
//		writer.println(100);
		while(sc.hasNextLine())
		{
			String str = sc.nextLine();
			System.out.println(str);
		}
		System.out.println("dd");
//		writer.close();
		sc.close();
	}
}
