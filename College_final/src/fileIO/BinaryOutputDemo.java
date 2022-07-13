package fileIO;
import java.io.*;
import java.util.Scanner;
public class BinaryOutputDemo
{
	public static void main (String [] args)
	{
		String fileName = "iu.dat";
		try
		{
			Scanner sc = new Scanner(System.in);
			DataOutputStream DOS = new DataOutputStream(new FileOutputStream("iu.dat"));
			for(int i=0;i<3;i++)
			{
				DOS.writeInt(sc.nextInt());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("No File");
		}
		catch(IOException e)
		{
			System.out.println("problem");
		}
	}
}
