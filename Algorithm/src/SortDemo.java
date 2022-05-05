import java.util.*;
public class SortDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a space-separated set of numbers(Ignore non-numeric characters)");
		String inpuString = sc.nextLine();
		String ans="";
		float[] arr;
		char check[] = inpuString.toCharArray();
		for(int i=0;i<check.length;i++)
		{
			if(check[i]==' '||(check[i]<80&&check[i]>89))
			{
				continue;
			}
			ans+=Character.toString(check[i]);
		}
		
		arr = new float[ans.length()];
		for(int i=0;i<ans.length();i++)
		{
			
		}
		MergeSort MS = new MergeSort(arr);
		System.out.println("Array values before sorting");
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]+" ");
		}
		MS.sort();
		System.out.println("\nArray values after sorting");
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]+" ");
		}
	}

}
