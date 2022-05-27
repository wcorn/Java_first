package ch11_codes;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BinaryInputDemo {
	public static void main(String[] args) {
		String fileName = "numbers.dat";
		try {
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
			System.out.println("Reaging the nonnegative integers.");
			System.out.println("in the file "+ fileName);
			int anInteger = inputStream.readInt();
			while(anInteger>=0) {
				System.out.println(anInteger);
				anInteger = inputStream.readInt();
			}
			System.out.println("End of reading form file.");
			inputStream.close();
		}catch(FileNotFoundException e) {
			System.out.println("problem opening the file: "+ fileName);
			System.exit(0);
		}catch(EOFException e) {
			System.out.println("Problem reading the file: "+fileName);
			System.out.println("Reached end of the file.");
		}catch(IOException e) {
			System.out.println("Problem with output to file: "+fileName);
			System.exit(0);
		}
	}

}
