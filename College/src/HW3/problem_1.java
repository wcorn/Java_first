/*
 Program to read three words and arranged lexicographically, print second word
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Assignment 1
 Last changed: April 11, 2022
 */
package HW3;
import java.util.*;
public class problem_1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter three words separated by space");
		String word1 = sc.next();	//첫번째 문자 입력
		String word2 = sc.next();	//두번째 문자 입력
		String word3 = sc.next();	//세번째 문자 입력
		String tmp;
		// 첫번째 단어 두번째 단어 사전순 정렬
		if(word1.compareTo(word2)>0) {
			tmp = word1;
			word1 = word2;
			word2 = tmp;
		}
		// 첫번째 단어 세번째 단어 사전순 정렬
		if(word1.compareTo(word3)>0) {
			tmp = word1;
			word1 = word3;
			word3 = tmp;
		}
		//두번째 단어 세번째 단어 사전순 정렬
		if(word2.compareTo(word3)>0) {
			tmp = word2;
			word2 = word3;
			word3 = tmp;
		}
		System.out.println("The middle word is "+word2);
		sc.close();
	}

}
