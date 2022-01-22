package class11;

import java.util.Calendar;
public class Test {
	public static void main(String[] args)
	{
		Company company1 = Company.getinstance();
		Company company2 = Company.getinstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();
	}
}
