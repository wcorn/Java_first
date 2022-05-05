//import java.util.Scanner;


//public class Ch02_codes {
//	public static void main(String[] args){
//		int numberOfBaskets, eggsPerBasket, totalEggs;
//		
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Enter the number of eggs in each basket:");
//		eggsPerBasket = keyboard.nextInt();
//		System.out.println("Enter the number of baskets:");
//		numberOfBaskets = keyboard.nextInt();
//		
//		totalEggs = numberOfBaskets * eggsPerBasket;
//		
//		System.out.println("If you have");
//		System.out.println(eggsPerBasket + " eggs per basket and");
//		System.out.println(numberOfBaskets + " baskets, then");
//		System.out.println("the total number of eggs is " + totalEggs);
//		
//		System.out.println("Now we take two eggs out of each basket.");
//		
//		eggsPerBasket = eggsPerBasket - 2;
//		totalEggs = numberOfBaskets * eggsPerBasket;
//		
//		System.out.println("You now have");
//		System.out.println(eggsPerBasket + " eggs per basket and");
//		System.out.println(numberOfBaskets + " baskets.");
//		System.out.println("The new total number of eggs is " + totalEggs);
//		keyboard.close();
//	}
//}


//public class Ch02_codes {
//	public static final double number = 3.14159;
//	public static void main(String[] args){
//		System.out.println(number);
//		final double var = 3.14159;
//		System.out.println(var);		
		
//		double distance = 9.0;
//		System.out.println(distance);		
//		int points = (int)distance;
//		System.out.println(points);
		
//		int hoursWorked = 40;
//		double payRate = 8.25;
//		System.out.println(hoursWorked * payRate);

//		double resultSum1 = 1/2 + 1/2;
//		System.out.println(resultSum1);

//		double resultSum2 = 1/2 + 1.0/2;
//		System.out.println(resultSum2);
	
//		double resultSum3 = 1/2.0 + 1.0/2;
//		System.out.println(resultSum3);
	
//		double testValue = 99/100;
//		System.out.println(testValue);

//		int remainder = 14 % 4;
//		System.out.println(remainder);

//		int m1 = 4;
//		int result1  = 3 * (++m1);
//		System.out.println(result1);
//		
//		int m2 = 4;
//		int result2  = 3 * (m2++);
//		System.out.println(result2);

// Ex2_1.a
//		Scanner keyboard = new Scanner(System.in);
//		int n, n1, n2;
//
//		System.out.print("Type 4-dit integer:");	
//		n = keyboard.nextInt();
//		
//		n1 = n / 1000;
//		n2 = n% 1000;
//		System.out.println(n1);
//		
//		n1 = n2 / 100;
//		n2 = n2% 100;
//		System.out.println(n1);
//		
//		n1 = n2 / 10;
//		n2 = n2% 10;
//		System.out.println(n1);
//		System.out.println(n2);

// Ex2_1.b
//		Scanner keyboard = new Scanner(System.in);
//		
//		System.out.print("Input a degree in Fahrenheit:");
//		double fahrenheit = keyboard.nextDouble();
//		double celsius = (5.0*(fahrenheit - 32.0))/ 9.0;
//		
//		System.out.println(fahrenheit + " degree in Fahrenheit is equal to " + celsius + " in Celsius.");
//		keyboard.close();
		

// Class		
//		String greeting;
//		greeting = "Hello!";
//		System.out.println(greeting);

//		String greeting = "Hello";
//		String sentence; 
//		sentence = greeting + " officer";
//		System.out.println(sentence);
	
//		String solution;
//		solution = "The answer is " + 42;
//		System.out.println(solution);
		
//		String greeting = "Hello";
////		System.out.println(strlen(greeting));
//		int n = greeting.length();
//		System.out.println(n);
//		int count = greeting.length() + 3;
//		System.out.println(count);
		
//		String sentence = "   Hi, world! ";
//		System.out.println(sentence);
//		sentence.trim();
//		sentence.toUpperCase();
//		System.out.println(sentence);

//		String sentence = "   Hi, world! ";
//		System.out.println(sentence);
//		sentence = sentence.trim();
//		sentence = sentence.toUpperCase();
//		System.out.println(sentence);
		
		
//// Listing 2.4
//		String sentence = "Text processing is hard!";
//		int position = sentence.indexOf("hard");
//		System.out.println(sentence);
//		System.out.println("012345678901234567890123");
//		System.out.println("The word \"hard\" starts at index " + position);
//		sentence = sentence.substring(0, position) + "easy!";
//		sentence = sentence.toUpperCase();
//		System.out.println("The changed string is:");
//		System.out.println(sentence);
		
		
//		System.out.println("\"Java\" refers to a language.");
//		System.out.println("abc\\def");
//		System.out.println("new\nline");
//		char singleQuote = '\'';
//		System.out.println(singleQuote);
		
		
//		int number = 10;
//		System.out.println("Lucky number = " + 13 +
//				" Secret number = " + number);
//
//		System.out.print("One, two,");
//		System.out.print(" buckle my shoe.");
//		System.out.println(" Three, four,");
//		System.out.println(" shut the door.");
		
	
		
// Lab - Listing 2.5
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Enter two whole numbers");
//		System.out.println("separated by one or more spaces:");
//		
//		int n1, n2;
//		n1 = keyboard.nextInt();
//		n2 = keyboard.nextInt();
//		System.out.println("You entered " + n1 + " and " + n2);
//		
//		System.out.println("Next enter two numbers.");
//		System.out.println("A decimal point is ok.");
//		
//		double d1, d2;
//		d1 = keyboard.nextDouble();
//		d2 = keyboard.nextDouble();
//		System.out.println("You entered " + d1 + " and " + d2);
//
//		System.out.println("Next enter two words:");
//		
//		String s1, s2;
//		s1 = keyboard.next();
//		s2 = keyboard.next();
//		System.out.println("You entered \"" + s1 + "\" and \"" + s2 + "\"");
//		
//		s1 = keyboard.nextLine();
//		
//		System.out.println("Next enter a line of text:");
//		s1 = keyboard.nextLine();
//		System.out.println("You entered: \"" + s1 + "\"");
//		keyboard.close();
		
//		int n;
//		String s1, s2;
//		Scanner keyboard = new Scanner(System.in);
//		n = keyboard.nextInt();
//		s1 = keyboard.nextLine();
//		s2 = keyboard.nextLine();
//		
//		System.out.println(n);
//		System.out.println(s1);
//		System.out.println(s2);

//	}
//}

/**
 * Program to compute area of a circle.
 * Author: Kiho Choi
 * E-mail Address: aikiho@gachon.ac.kr
 * Programming Assignment 2.
 * Last Changed: Mar. 24 2022.
 */

//import java.util.Scanner;
//public class Ch02_codes 
//{
//	public static void main(String[] args)
//	{
//		double radius;
//		double area;
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Enter the radius of a circle in inches:");
//		radius = keyboard.nextDouble();
//		area = 3.14159 * radius * radius;
//		System.out.println("A circle of radius " + radius + " inches");
//		System.out.println("has an area of " + area + " square inches.");
//		keyboard.close();
//	}
//}
//
//import java.util.Scanner;
//public class Ch02_codes 
//{
//	public static final double PI = 3.14159;
//	public static void main(String[] args)
//	{
//		double radius;
//		double area;
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Enter the radius of a circle in inches:");
//		radius = keyboard.nextDouble();
//		area = PI * radius * radius;
//		System.out.println("A circle of radius " + radius + " inches");
//		System.out.println("has an area of " + area + " square inches.");
//		keyboard.close();
//	}
//}