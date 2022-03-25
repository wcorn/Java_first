package HW2;
import java.util.*;
public class Problem_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of text.");
		//문자열 읽기
		String text = sc.nextLine();
		String text2;
		System.out.println("I have rephrased that line to read:");
		//hate 위치 찾고 저장
		int n = text.indexOf("hate");
		// hate가 있을때 
		if(n>=0) {
			//hate 위치 전, love 문자열 합쳐서 저장
			text2 = text.substring(0, n)+"love";
			//hate 후 나머지 문자열 합쳐서 저장
			text2 = text2+text.substring(n+4);
			System.out.println(text2);
		}
		//hate가 없을때
		else {
			System.out.println("Couldn't find \"hate \"");
		}
		sc.close();
	}
}
