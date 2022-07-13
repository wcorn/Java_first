package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buffer_write {
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		try {
			bw = new BufferedWriter(new FileWriter("iu.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("zz");
			System.exit(0);
		}
		int num;
		for(int i=0;i<10;i++)
		{
			bw.write(sc.nextLine()+"\n");
			bw.flush();
		}
		bw.close();
	}

}
