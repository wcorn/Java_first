/*
 program that reads a one-line sentence as input and then displays the following response: 
  ends with a question mark (?) and the input contains an even number of characters, display the word Yes.
  ends with a question mark (?) and the input contains an odd number of characters, display the word No.
  ends with an exclamation point (!), display the word Wow.
  all other cases, display the words You always say followed by the input string enclosed in quotes
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Assignment 2
 Last changed: April 11, 2022
 */
package HW3;
import java.util.*;
public class problem_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a one line question or statement");
		String str = sc.nextLine();	//문자열 입력
		//문자열 마지막 문자가 ?이고 문자길이 짝수 일때 Yes 프린트
		if(str.endsWith("?")&&str.length()%2==0) {
			System.out.println("Yes");
		}
		//문자열 마지막 문자가 ?이고 문자길이 혹수 일때 No 프린트
		else if(str.endsWith("?")&&str.length()%2==1) {
			System.out.println("No");
		}
		//문자열 마지막 문자가 !일때 Wow 프린트
		else if(str.endsWith("!")) {
			System.out.println("Wow");
		}
		//나머지 문자열에 큰따옴표 붙인 후 앞에 You always say 붙여서 프린트
		else {
			System.out.println("You always say \""+str+"\"");
		}
		sc.close();
	}

}
