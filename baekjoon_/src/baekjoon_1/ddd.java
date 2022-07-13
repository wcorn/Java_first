package baekjoon_1;
import java.util.Scanner;
public class ddd {
	public static void main(String[] args)
	{
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        String trimStr = str.trim();
	        String[] str2 = trimStr.split(" ");
	        System.out.println("/" +str2[0]+"/"+str2.length);
	}
}