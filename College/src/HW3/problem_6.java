/*
 program to read a list of exam scores given as integer percentages in the range 0 to 100 and 
 display the total number of grades and the number of grades in each letter-grade category 
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Assignment 6
 Last changed: April 11, 2022
 */
package HW3;
import java.util.Scanner;
public class problem_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerical grades");
		System.out.println("in the range 0 to 100 - ");
		System.out.println("   integers, only, please!\n");
		System.out.println("Enter -1 to terminate data entry.\n\n");
		int num;		//점수 저장할 변수
		int A_count=0;	//A 학생 수
		int B_count=0;	//B 학생 수
		int C_count=0;	//C 학생 수
		int D_count=0;	//D 학생 수
		int F_count=0;	//F 학생 수
		int count=0;
		// 무한 루프
		while(true) {
			System.out.println("Please enter a score from 0 to 100 or -1 to quit:");
			num = sc.nextInt();
			// -1 입력 시 탈출
			if(num==-1) {
				break;
			}
			//점수 매길 학생 더하기
			count++;
			//해당 점수대일 경우 해당 점수대 카운트 1더하기
			if(num>90) {
				A_count++;
			}
			else if(num>80) {
				B_count++;
			}
			else if(num>70) {
				C_count++;
			}
			else if(num>60) {
				D_count++;
			}
			else  {
				F_count++;
			}	
		}
		System.out.println("Total number of grades = "+count);
		System.out.println("Number of A's = "+A_count);
		System.out.println("Number of B's = "+B_count);
		System.out.println("Number of C's = "+C_count);
		System.out.println("Number of D's = "+D_count);
		System.out.println("Number of F's = "+F_count);
		sc.close();
	}

}
