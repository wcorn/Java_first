package fileIO;
import java.io.*;
public class Emp_sre_write {
	public static void main(String[] args) {
		try
		{
			ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("emp.sre"));
			Emp_sre emp = new Emp_sre(1, "IU", "Singer", 10000);
			OOS.writeObject(emp);
			OOS.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("No file");
		}
		catch(IOException e)
		{
			System.out.println("I/o havve problem");
		}
	}

}
