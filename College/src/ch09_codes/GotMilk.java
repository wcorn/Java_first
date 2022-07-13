package ch09_codes;
import java.util.*;
public class GotMilk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter number of donuts:");
			int donutCount = sc.nextInt();
			System.out.println("Enter number of flasses of milk");
			int milkCount = sc.nextInt();
			if(milkCount<1)
			{
				throw new Exception("Exception: no milk!");
			}
			double donutsPerGlass = donutCount / (double)milkCount;
			System.out.println(donutCount+" donuts");
			System.out.println(milkCount+ "glasses of milk");
			System.out.println("you have "+ donutsPerGlass+" donuts for each glass of milk");
		}
		catch(Exception e)
		{
			System.out.println("no milk");
			System.out.println("Go buy some milk");
		}
		finally
		{
			System.out.println("IU");
		}
		System.out.println("End of program");
	}

}
