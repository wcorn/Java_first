package fileIO;

import java.io.*;

public class Buffer_read {
	public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader(new File("iu.txt")));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Don't found file :");
			System.exit(0);
		}
		String[] num = new String[100];
		int count=0;
		while((num[count] = br.readLine()) != null)
		{
			System.out.println(num[count++]);
		}
		System.out.println(count+"count");
		while(count>0)
		{
			System.out.println(num[--count]);
		}
	}

}
