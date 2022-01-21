package class07;

public class Test {
	public static void main(String[] args)
	{
		Report builder = new Report();
		String report = builder.getReport();
		
		System.out.println(report);
	}
}
