/*
 * Program to compute area of a circle.
 * Author: dongseok kang
 * E-mail Address : dsk0820@naver.com
 * Programming Assignment 2.
 * Last Changed: Mar. 24 2022.
 */
import java.io.*;
import java.util.*;
public class play {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		char[] answer = {'a','b','c','d'};
		int[] br = new int[26];
		for(int i=0;i<answer.length;i++)
		{
			br[answer[i]-97]++;
		}
		for(int i=0;i<26;i++)
		{
			System.out.println(br[i]);
		}
	}
}