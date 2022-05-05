/*
 Program to convert a temperature given in degrees from either Celsius to Fahrenheit or Fahrenheit to Celsius.
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Assignment 1
 Last changed: April 11, 2022
 */
package HW2;
import java.util.*;
public class Problem_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter price of item");
		System.out.print("(from 25 cent to a dollar, in 5-cent increments): ");
		//cent �Է�
		int cent = sc.nextInt();
		//�Ž�����
		int change = 100-cent;
		//���� ��� �� �Ž��������� ����
		int quarters = change/25;
		change%=25;
		//�� ��� �� �Ž��������� ����
		int diems = change/10; 
		change%=10;
		//���� ���
		int nickel = change/5;
		System.out.println("\nYou bought an item for "+ cent+" cents and gave me a dollar,");
		System.out.println("so yoyr change is");
		System.out.println(quarters+" quarters");
		System.out.println(diems+" diems, and");
		System.out.println(nickel+ " nickel.");
		sc.close();
	}

}
