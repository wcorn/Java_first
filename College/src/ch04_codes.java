	//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
//		int count, number;
//		System.out.println("Enter a number");
//		Scanner keyboard = new Scanner(System.in);
//		number = keyboard.nextInt();
//		
//		count = 1;
//		
//		while(count <= number)
//		{
//			System.out.print(count + ", ");
//			count = count + 1;
//		}
//		
//		System.out.println();
//		System.out.println("Buckle my shoe.");
//		keyboard.close();
//	}
//}


//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
//		int count, number;
//		System.out.println("Enter a number");
//		Scanner keyboard = new Scanner(System.in);
//		number = keyboard.nextInt();
//		
//		count = 1;
//		do
//		{
//			System.out.print(count +", ");
//			count++;
//		}while(count <= number);
//		
//		System.out.println();
//		System.out.println("Buckle my shoe.");
//		keyboard.close();
//	}
//}


//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
//		System.out.println("This program computes the average of");
//		System.out.println("a list of (nonnegative) exam scores");
//		
//		double sum;
//		int numberOfStudents;
//		double next;
//		String answer;
//		Scanner keyboard = new Scanner(System.in);
//		
//		do
//		{
//			System.out.println();
//			System.out.println("Enter all the scores to be averaged.");
//			System.out.println("Enter a negative number after");
//			System.out.println("you have entered all the scores.");
//			
//			sum = 0;
//			numberOfStudents = 0;
//			next= keyboard.nextDouble();
//			
//			while(next >= 0)
//			{
//				sum = sum + next;
//				numberOfStudents++;
//				next= keyboard.nextDouble();
//			}
//			
//			if (numberOfStudents > 0 )
//				System.out.println("The average is " + (sum / numberOfStudents));
//			else
//				System.out.println("No scores to average.");
//			
//			System.out.println("Want to average another exam?");
//			System.out.println("Enter yes or no.");
//			answer = keyboard.next();
//		}while(answer.equalsIgnoreCase("yes"));
//		keyboard.close();
//	}
//}





//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
////		int count = 0;
////		for(count = 1; count <=2; count++) { // count = 1, 2
////			System.out.println(count);
////		}
//
//		int count = 1;
//		if(count <=2) {
//			System.out.println(count);
//			count++;
//		}	
//		if(count <=2) {
//			System.out.println(count);
//			count++;
//		}	
//		if(count <=2) {
//			System.out.println(count);
//			count++;
//		}	
//	}
//}



//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
////		int count = 0;
////		for(count = 1; count <=2; count++) {
////			System.out.println(count);
////		}
////		System.out.println(count);
//
//		
//		for(int count = 1; count <=2; count++) {
//			System.out.println(count);
//		}
//		System.out.println(count);
//	}
//}




//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
//		int countDown;
//		for(countDown = 3; countDown >= 0; countDown-- ) {
//			System.out.println(countDown);
//			System.out.println("and counting.");
//		}
//		System.out.println("Blast off!");
//	}
//}


//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
//	    Scanner keyboard = new Scanner(System.in);
//	    int sum = 0;
//	    for (int i = 1; i <= 10; i++) {
//	      System.out.println("Please enter a new number (" + i + " of 10):");
//	      int input = keyboard.nextInt();
//	      sum += input;
//	    }
//	    System.out.println("Total sum is: " + sum);	
//	}
//}



//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
//		int n, product;
////		for (n = 1, product = 1; n <= 4; n++)
////		    product = product * n; // 1*2*3*4
//
//		for (n = 1, product = 1; n <= 4; product = product * n, n++);
//		
//		System.out.println("Product is: " + product);	
//	}
//}


//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
////		enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};
////		for (Suit nextSuit : Suit.values())
////			System.out.print(nextSuit + " ");
////		System.out.println();	
//
//		int arr[] = { 12, 13, 14, 44};
//		for (int num : arr)
//			System.out.println(num);	
//	
//	}
//}


//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
//	
//		System.out.println("Enter nonnegative numbers.");
//		System.out.println("Place a neagetive number at the end");
//		System.out.println("to serve as an end marker.");
//		Scanner keyboard = new Scanner(System.in);
//		int num = 0;
//		int sum = 0;
//		num = keyboard.nextInt();
//		while(num >= 0) {
//			sum += num;
//			num = keyboard.nextInt();
//		}
//		System.out.println("The sum of the numbers is " + sum);
//		keyboard.close();
//
//	}
//}


//package ch04_codes;
//import java.util.Scanner;
//
//public class Ch04_codes {
//	public static void main(String[] args) {
//		int count = 10;
//		for (int i = 0; i < count; i ++) {
//		    if (i == 3) break;
////		    if (i == 3) continue;
//		    System.out.println(i);
//		}
//		System.out.println("Loop complete");
//	}
//}

public class ch04_codes {
	public static void main(String[] args) {

		int n = 1;
		int limit = 8;
		assert n == 1 : "Error occured";
		while (n < limit)
		{
			n = 2 * n;
			System.out.println(n);
		}
		assert n > limit : "Error occured";
		//n is the smallest power of 2 >= limit
		//n >= limit

	}
}
