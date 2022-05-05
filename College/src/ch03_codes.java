//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static final double OVERDRAWN_PENALTY = 8.00;
//	public static final double INTEREST_RATE = 0.02;
//	
//	public static void main(String[] args) {
//		double balance;
//		
//		System.out.print("Enter your checking account balance: $");
//		Scanner keyboard = new Scanner(System.in);
//		balance = keyboard.nextDouble();
//		System.out.println("Original balance $" + balance);
//		
////		if(balance >= 0)
////			balance = balance + (INTEREST_RATE * balance) / 12;
////		else
////			balance = balance - OVERDRAWN_PENALTY;
//
//		if(balance >= 0)
//		{	
//			System.out.println("Good for you. You earned interest.");
//			balance = balance + (INTEREST_RATE * balance) / 12;		
//		}
//		else
//		{	
//			System.out.println("You will be charged a penalty.");
//			balance = balance - OVERDRAWN_PENALTY;
//		}
//		
//		System.out.print("After adjusting for one month ");
//		System.out.println("of interest and penalties,");
//		System.out.println("your new balance is $" + balance);
//		keyboard.close();
//	}
//}

//
//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	
//	public static void main(String[] args) {
//		String s1, s2;
//		System.out.println("Enter two lines of texts:");
//		Scanner keyboard = new Scanner(System.in);
//		s1 = keyboard.nextLine();
//		s2 = keyboard.nextLine();
//		
//		if(s1.equals(s2))
//			System.out.println("The two lines are equal.");
//		else
//			System.out.println("The two lines are not equal.");
//
//		if(s2.equals(s1))
//			System.out.println("The two lines are equal.");
//		else
//			System.out.println("The two lines are not equal.");
//		
//		if(s1.equalsIgnoreCase(s2))
//			System.out.println("But the lines are equal, ignoring case.");
//		else
//			System.out.println("Lines are not equal, even ignoring case.");
//
//		keyboard.close();
//	}
//}



//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	
//	public static void main(String[] args) {
//		int a =10, b = 20, c = 30, d = 40;
//		
//		if (a > b)
//		{
//			if(c > d)
//				System.out.println("e=f");			
//		}
//		else
//			System.out.println("g=h");
//
////		if (a > b)
////			if(c > d)
////				System.out.println("e=f");			
////		else
////			System.out.println("g=h");
//		
//	}
//}


//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	
//	public static void main(String[] args) {
//		
//		int score;
//		char grade;
//		
//		System.out.println("Enter your score: ");
//		Scanner keyboard = new Scanner(System.in);
//		
//		score = keyboard.nextInt();
//		
//		if (score >= 90)
//			grade = 'A';
//		else if (score >= 80)
//			grade = 'B';
//		else if (score >= 70)
//			grade = 'C';
//		else if (score >= 60)
//			grade = 'D';
//		else
//			grade = 'F';
//
//		System.out.println("Score = " + score);
//		System.out.println("Grade = " + grade);
//		
//		keyboard.close();			
//		
//	}
//}


//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static void main(String[] args) {
//		int n1 = 100, n2 = 200;
////		int max;
////		if( n1 > n2 )
////			max = n1;
////		else	
////			max = n2;
//		int max = (n1 > n2)? n1 :  n2;
//		
//		System.out.println("Max value = " + max);
//		
//	}
//}


//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static void main(String[] args) {
//
//		int numberOfWinners = 0;
//		int payoff = 1;
//		int oneShare;
//		
//		if (numberOfWinners == 0) {
//			System.out.println("Error: Dividing by zero.");
//			System.exit(0);
//		}
//		else {
//			oneShare = payoff / numberOfWinners;
//			System.out.println("Each winner will receive $" + oneShare);
//		}
//	}
//}

//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static void main(String[] args) {
//
//		int year = 2;
//		
//		switch (year) {
//		case 1:
//		    System.out.println("freshman");
//		    break;
//		case 2:
//		    System.out.println("sophomore");
//		    break;
//		case 3:
//		    System.out.println("junior");
//		    break;
//		case 4:
//		    System.out.println("senior");
//		    break;
//		case 5:
//		    System.out.println("super senior");
//		    break;
//		default:
//		    System.out.println("huh?");
//		    break;
//		}
//	}
//}




//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static void main(String[] args) {
//
//		boolean systemsAreOk = false;
//		System.out.println("boolean = " + systemsAreOk);
//		System.out.println("Test = " + (1==1));
//	}
//}



//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static void main(String[] args) {
//		boolean booleanVar = false;
//		System.out.println(booleanVar);
//		System.out.println("Enter a boolean value:");
//		Scanner keyboard = new Scanner(System.in);
//		booleanVar = keyboard.nextBoolean();
//		System.out.println("You entered " + booleanVar);
//		keyboard.close();
//	}
//}



//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static void main(String[] args) {
//		int year = 1;
//		if (year == 1)
//		    System.out.println("freshman");
//		else if (year == 2)
//		    System.out.println("sophomore");
//		else if (year == 3)
//		    System.out.println("junior");
//		else if (year == 4)
//		    System.out.println("senior");
//		else if (year == 5)
//		    System.out.println("super senior");
//		else
//		    System.out.println("huh?");
//		
////		switch (year) {
////		case 1:
////		    System.out.println("freshman");
////		    break;
////		case 2:
////		    System.out.println("sophomore");
////		    break;
////		case 3:
////		    System.out.println("junior");
////		    break;
////		case 4:
////		    System.out.println("senior");
////		    break;
////		case 5:
////		    System.out.println("super senior");
////		    break;
////		default:
////		    System.out.println("huh?");
////		    break;
////		}
//		
//	}
//}

//
//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static void main(String[] args) {
//		int numberOfBabies;
//		System.out.print("Enter number of babies: ");
//		Scanner keyboard = new Scanner(System.in);
//		numberOfBabies = keyboard.nextInt();
//		
//		switch(numberOfBabies)
//		{
//			case 1:
//				System.out.println("Congratulation.");
//				break;
//			case 2:
//				System.out.println("Wow. Twins.");
//				break;
//			case 3:
//				System.out.println("Wow. Triplets.");
//				break;
//			case 4:
//			case 5:
//				System.out.print("Unbelievable; ");
//				System.out.println(numberOfBabies + " babies.");
//				break;
//			default:
//				System.out.println("I don't believe you.");
//		}
//		keyboard.close();
//	}
//}



//package ch03_codes;
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static void main(String[] args) {
//		double amount;
//		System.out.print("Enter number of init money: ");
//		Scanner keyboard = new Scanner(System.in);
//		amount = keyboard.nextDouble();
//
//		double serviceCharge = 0.0;
//		if (amount < 10) {
//			serviceCharge = 1.0;
//		} else if (amount < 100) {
//			serviceCharge = 0.1 * amount;
//		} else if (amount < 1000) {
//			serviceCharge = 5 + (0.05 * amount);
//		} else if (amount >= 1000) {
//			serviceCharge = 40 + (0.01 * amount);
//		}
//
//		System.out.println("Service Charge: " + serviceCharge);
//
//		keyboard.close();
//	}
//}




import java.util.Scanner;

public class ch03_codes {
	public static void main(String[] args) {
		int amount;
		System.out.print("Enter number of init money: ");
		Scanner keyboard = new Scanner(System.in);
		amount = keyboard.nextInt();

		if(amount < 25 || amount%5 != 0 || amount > 100 ) {
			System.out.println("Error!");
		}
		else {
			System.out.println("Entered correctly");		
		}
	
		keyboard.close();
	}
}


//
//package ch03_codes;
//
//import java.util.Scanner;
//
//public class Ch03_codes {
//	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);
//		char letter = keyboard.next().charAt(0);
//		double gradeValue = 0.0;
//
//		switch (letter) {
//		case 'A':
//			gradeValue = 4.0;
//			break;
//		case 'B':
//			gradeValue = 3.0;
//			break;
//		case 'C':
//			gradeValue = 2.0;
//			break;
//		case 'D':
//			gradeValue = 1.0;
//			break;
//		case 'F':
//			gradeValue = 0.0;
//			break;
//		default:
//			gradeValue = 0.0;
//			System.out.println("The grade " + letter + " is not valid");
//		}
//
//		System.out.println("The grade value is " + gradeValue);
//		keyboard.close();
//	}
//}


//
//package ch03_codes;
//
//import java.util.Scanner;
//
//public class Ch03_codes {
//	enum MovieRating {
//		E, A, B
//	}
//
//	public static void main(String[] args) {
//		MovieRating rating;
//		rating = MovieRating.A;
//
//		switch (rating) {
//		case E: // Excellent
//			System.out.println("You must see this movie!");
//			break;
//		case A: // Average
//			System.out.println("This movie is OK, but not great.");
//			break;
//		case B: // Bad
//			System.out.println("Skip it!");
//			break;
//		default:
//			System.out.println("Something is wrong.");
//		}		
//	}
//}




//package ch03_codes;
//
//import java.util.Scanner;
//
//public class Ch03_codes {
//        public static void main(String[] args)
//        {
//            Scanner keyboard = new Scanner(System.in);
//
//            System.out.println("Enter a four bit binary value.");
//
//            String binary = keyboard.next();
//
//            String bit0 = binary.substring(0, 1);
//            String bit1 = binary.substring(1, 2);
//            String bit2 = binary.substring(2, 3);
//            String bit3 = binary.substring(3, 4);
//
//            int b0 = Integer.parseInt(bit0); 
//            int b1 = Integer.parseInt(bit1);
//            int b2 = Integer.parseInt(bit2);
//            int b3 = Integer.parseInt(bit3);
//
//            int value = b0*8 + b1*4 + b2*2 + b3;
//
//
//            System.out.println("The value of " + binary + " is " + value);
//        }
//}
