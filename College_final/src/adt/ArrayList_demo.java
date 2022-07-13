package adt;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> item = new ArrayList<String>();
		System.out.println("Enter items for the list, when prompted");
		String next="";
		do {
			System.out.println("Type an entry");
			item.add(sc.nextLine());
			System.out.println("More items for the list?");
			next = sc.nextLine();
		}
		while(next.equalsIgnoreCase("yes"));
		ArrayList<String> copy_item = (ArrayList<String>)item.clone();
		System.out.println("The list contains");
		for(int i=0;i<copy_item.size();i++)
		{
			System.out.println(copy_item.get(i));
		}
		sc.close();
	}

}
