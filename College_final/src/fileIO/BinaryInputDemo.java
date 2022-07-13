package fileIO;
import java.io.*;
public class BinaryInputDemo
{
	public static void main (String [] args)
	{
		String fileName = "iu.dat";
		try
		{
			DataInputStream DIS = new DataInputStream(new FileInputStream("iu.dat"));
			while(true)
			{
				System.out.println(DIS.readInt());
			}
		}
		catch(FileNotFoundException e) 
		{
			System.out.println("No file");
		}
		catch(EOFException e)
		{
			System.out.println("End file");
		}
		catch(IOException e)
		{
			System.out.println("problem");
		}
	}
}

