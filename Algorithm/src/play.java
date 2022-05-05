import java.util.Scanner;
public class play {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a space-separated set of numbers");
		String str = sc.nextLine();
		String[] str2 = str.split(" ");
		int[] arr = new int[str2.length];
		for(int i=0;i<str2.length;i++)
		{
			arr[i] = Integer.parseInt(str2[i]);
		}
		mergeSort MS = new mergeSort(arr);
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
