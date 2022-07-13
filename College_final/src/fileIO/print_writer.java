package fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class print_writer {
	public static void main(String[] args) {
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);
		try {
			pw = new PrintWriter("iu.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("dontfound");
			System.exit(0);
		}
		for(int i=0;i<10;i++)
		{
			pw.write(sc.nextLine()+"\n");
			pw.flush();
		}
		pw.close();
	}

}
