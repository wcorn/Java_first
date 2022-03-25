/*
 * Program to compute area of a circle.
 * Author: dongseok kang
 * E-mail Address : dsk0820@naver.com
 * Programming Assignment 2.
 * Last Changed: Mar. 24 2022.
 */
import java.util.Scanner;
public class play {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double radius;
		double area;
		System.out.println("Enter");
		radius = sc.nextInt();
		area = 3.141592*radius*radius;
		System.out.println(radius+"inch");
		System.out.println(area+"inch");
		sc.close();
	}

}
