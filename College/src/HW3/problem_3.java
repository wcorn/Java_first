/*
 Program to convert a temperature given in degrees from either Celsius to Fahrenheit or Fahrenheit to Celsius.
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Assignment 3
 Last changed: April 11, 2022
 */
package HW3;
import java.util.*;
public class problem_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double degree;	//온도
		double result;	//변환 후 결과
		String temp;	//온도단위
		System.out.println("Enter a temperature in degress(for example 29.6): ");
		//온도 입력
		degree = sc.nextDouble();
		System.out.println("Enter 'F' (or 'f') for Fahrenhit or'C' (or 'c') for Celsius: ");
		//화씨인지 섭씨인지 입력
		temp = sc.next();
		//화씨일 경우 섭씨로 바꾸고 프린트
		if(temp.equalsIgnoreCase("F")) {
			result = 5 * (degree - 32) / 9;
			System.out.println(degree+" degrees F = " + result + "dgrees Celsius");
		}
		//섭씨일 경우 화씨로 바꾸고 프린트
		else if(temp.equalsIgnoreCase("C")) {
			result = (9 * (degree) / 5) + 32;
			System.out.println(degree+" degrees C = " + result + " dgrees Fahrenheit");
		}
		else {
			 	System.out.println("The input is invalid.");
		}
		sc.close();
	}

}
