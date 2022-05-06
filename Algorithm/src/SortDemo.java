import java.util.*;
public class SortDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a space-separated set of value");
		String inpuString = sc.nextLine();
		String ans="";
		String[] arr;
		char check[] = inpuString.toCharArray();
		for(int i=0;i<check.length;i++)
		{
			if(check[i]==' ')
			{
				continue;
			}
			ans+=Character.toString(check[i]);
		}
		
		arr = ans.split("");
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
