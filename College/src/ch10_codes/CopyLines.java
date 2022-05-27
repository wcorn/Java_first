package ch10_codes;
import java.io.*;
public class CopyLines {
	public static void main(String[] args) throws IOException
	{
		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;
		try
		{
			inputStream = new BufferedReader(new FileReader("out.txt"));
			outputStream = new BufferedWriter(new FileWriter("dest.txt"));
			String l;
			while((l = inputStream.readLine())!=null)
			{
				outputStream.append(l+"\n");
			}
			outputStream.flush();
		}finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream!=null) {
				outputStream.close();
			}
		}
	}
}
