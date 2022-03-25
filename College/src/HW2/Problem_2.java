package HW2;
import java.util.*;
public class Problem_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of text. No punctuation please.");
		String text = sc.nextLine();
		String text2;
		System.out.println("I have rephrased that line to read:");
		//첫 공백 위치 찾기
		int n = text.indexOf(" ");
		// 문자열이 단어 2개 이상으로 이루어 있을 때 
		if(n>=0) {
			// 첫공백 위치 기준으로 자른 문자열 두개 위치 바꾸고 가운데 공백 추가 
			text2 = text.substring(n)+" "+text.substring(0,n);
			//양 끝 공백 제거
			text2 = text2.trim();
			//첫 문자 대문자로 변경후 나머지 이어 붙이기
			text2 = text2.substring(0,1).toUpperCase()+text2.substring(1);
			System.out.println(text2);
		}
		//문자열이 단어 한개로 이루어 있을 때 
		else {
			//첫 문자 대문자로 변경후 나머지 이어 붙이기
			text = text.substring(0,1).toUpperCase()+text.substring(1);
			System.out.println(text);
		}
		sc.close();
	}
}
