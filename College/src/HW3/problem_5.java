/*
 Program to read a list of nonnegative integers and to display 
 the largest integer, the smallest integer, and the average of all the integers.
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Assignment 5
 Last changed: April 11, 2022
 */
package HW3;
import java.util.Scanner;
public class problem_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program allows you to enter a list of positive integer");
		System.out.println("(terminated by a -1) then displays  the largest value,");
		System.out.println("smallest value, and average of the list of number,");
		System.out.println("not including the final (negative) value that ends the list\n");
		int num;	//입력받을 값
		double sum = 0;	//값들의 합
		// max min 값에 int형의 최소 최대값 저장
		int max = Integer.MIN_VALUE;	//최대값 저장할 변수
		int min = Integer.MAX_VALUE;	//최소값 저장할 변수
		int count=0;					//입력받은 수 개수
		while(true) {
			System.out.println("Please enter a positive integer, or -1 to quit.");
			num = sc.nextInt();
			//음의 센티널 값 -1 입력하면 탈출
			if(num==-1) {
				break;
			}
			// num과 max, min 값을 비교해 큰값 작은값 저장
			max = Math.max(max, num);
			min = Math.min(min, num);
			// 평균 출력을 위해 double로 형변환후 저장
			sum+=(double)num;
			count++;
		}
		System.out.println("For the"+count+"numbers you entered");
		System.out.println("the largest value = "+max);	
		System.out.println("the smallest value = "+min);	
		System.out.println("and the average is = "+sum/count);
		sc.close();
	}
}
