package ch10_codes;
import java.io.*;
import java.util.*;
public class transaction {
	public static void main(String[] args) throws IOException{
		String fileName = "Transactions.txt";
		try
		{
			Scanner inputStream = new Scanner(new File(fileName));
			
			String line = inputStream.nextLine();
			double total = 0;
			while(inputStream.hasNextLine())
			{
				line = inputStream.nextLine();
				String[] ary = line.split(",");
				String SKU = ary[0];
				int quantity = Integer.parseInt(ary[1]);
				double price = Double.parseDouble(ary[2]);
				String description = ary[3];
				System.out.printf("Sold %d of %s (SKU: %s) at $%1.2f each.\n",quantity,description,SKU,price);
				total +=quantity*price;
			}
			System.out.printf("Total sales : $%1.2f\n",total);
			inputStream.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find "+fileName);
		}
		catch(Exception e)
		{
			System.out.println("Problem with input from files"+fileName);
		}
	}

}
