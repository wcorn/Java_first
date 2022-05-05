package ch06_codes;


import java.util.Scanner;

public class PetDemo
{
    public static void main(String[] args)
    {
        Pet yourPet = new Pet("Jane Doe");
//        Pet yourPet = new Pet("Fido", 2, 4.5);
//        Pet yourPet = new Pet("Cha Cha");
//        Pet yourPet = new Pet();
        System.out.println("My records on your pet are inaccurate.");
        System.out.println("Here is what they currently say:");
        yourPet.writeOutput( );
		
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the correct pet name:");
        String correctName = keyboard.nextLine( );
		yourPet.setName(correctName);
		
        System.out.println("Please enter the correct pet age:");
        int correctAge = keyboard.nextInt( );
		yourPet.setAge(correctAge);

        System.out.println("Please enter the correct pet weight:");
        double correctWeight = keyboard.nextDouble( );
		yourPet.setWeight(correctWeight);

        System.out.println("My updated records now say:");
        yourPet.writeOutput( );
        keyboard.close();
    }
}

