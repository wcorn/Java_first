package HW2;
import java.util.*;
public class Problem_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of text.");
		//���ڿ� �б�
		String text = sc.nextLine();
		String text2;
		System.out.println("I have rephrased that line to read:");
		//hate ��ġ ã�� ����
		int n = text.indexOf("hate");
		// hate�� ������ 
		if(n>=0) {
			//hate ��ġ ��, love ���ڿ� ���ļ� ����
			text2 = text.substring(0, n)+"love";
			//hate �� ������ ���ڿ� ���ļ� ����
			text2 = text2+text.substring(n+"hate".length());
			System.out.println(text2);
		}
		//hate�� ������
		else {
			System.out.println("Couldn't find \"hate \"");
		}
		sc.close();
	}
}
