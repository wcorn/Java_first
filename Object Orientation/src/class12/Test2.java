package class12;

public class Test2 {
	public static void main(String[] args) {
		char[] arr = new char[26];
		char ch = 'A';
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = ch++;
		}
		for(char k : arr)
		{
			System.out.println(k);
		}
	}
}
