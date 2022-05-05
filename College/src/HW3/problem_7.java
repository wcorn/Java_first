/*
 program that uses stars to represent triangles after you have entered a triangular size between 1 and 50
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Assignment 7
 Last changed: April 11, 2022
 */
package HW3;
import java.util.Scanner;
public class problem_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer from 1 to 50 :");
		int num = sc.nextInt();	//삼각형 길이
		//*을 입력한 숫자까지 한개부터 한개씩 더해가며 출력
		for(int i=0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//*을 입력한숫자-1 부터 1개까지 한개씩 빼가며 출력
		for(int i=num-1;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
