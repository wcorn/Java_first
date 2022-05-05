/*
 Program that reads a string from the keyboard and tests whether it contains a valid date
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Assignment 4
 Last changed: April 11, 2022
 */
package HW3;
import java.util.*;
public class problem_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a	date to be check");
		int day;	//일
		int month;	//월
		int year;	//연
		String date;//입력받을 날짜
		//날짜 문자열 입력
		date = sc.next();
		// 문자열 '/' 기준으로 나누고 배열에 저장
		String str[] = date.split("/");//입력받은 날짜 구분하여 저장할 배열
		// 문자열 달, 일, 연 을 숫자로 바꿔 저장
		month = Integer.parseInt(str[0]);
		day = Integer.parseInt(str[1]);
		year = Integer.parseInt(str[2]);
		System.out.println("date is "+month+":"+day+":"+year);
		System.out.println("your date was "+month+"/"+day+"/"+year);
		//해당 달의 답변 출력
		switch(month) {
			case 1:
				if(day>31) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 31 in January in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 2:
				// 윤년에 따라 출력
				if((year%4==0&&year%100!=0)||(year%400==0)) {
					if(day>29) {
						System.out.println("It is not a valid date.");
						System.out.println("The reason it is invaild: The day  value is greater than 29 in Febuary in a non leap year");
					}
					else {
						System.out.println("It is a valid date.");
					}
				}
				else {
					if(day>28) {
						System.out.println("It is not a valid date.");
						System.out.println("The reason it is invaild: The day  value is greater than 28 in January in a non leap year");
					}
					else {
						System.out.println("It is a valid date.");
					}
				}
				break;
			case 3:
				if(day>31) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 31 in March in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 4:
				if(day>30) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 30 in April in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 5:
				if(day>31) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 31 in May in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 6:
				if(day>30) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 30 in June in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 7:
				if(day>31) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 31 in July in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 8:
				if(day>31) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 31 in August in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 9:
				if(day>30) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 30 in September in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 10:
				if(day>31) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 31 in October in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 11:
				if(day>30) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 30 in November in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
			case 12:
				if(day>31) {
					System.out.println("It is not a valid date.");
					System.out.println("The reason it is invaild: The day  value is greater than 31 in December in a non leap year");
				}
				else {
					System.out.println("It is a valid date.");
				}
				break;
				// 1~12월 이외의 달의 경우 출력
			default:
				System.out.println("It is not a valid date.");
				System.out.println("The reason it is invalid: The month value is not from 1 to 12.");
				break;
		}
		sc.close();
	}

}
