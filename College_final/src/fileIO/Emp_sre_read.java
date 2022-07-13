package fileIO;
import java.io.*;
public class Emp_sre_read {
	public static void main(String[] args) {
		try
		{
			ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("emp.sre"));
			Emp_sre emp = null;
			emp = (Emp_sre)OIS.readObject();
			System.out.println(emp.getName());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("No file");
		}
		catch(IOException e)
		{
			System.out.println("I/O have problem");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("No class");
		}
	}

}
