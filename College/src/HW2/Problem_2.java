	package HW2;
import java.util.*;
public class Problem_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of text. No punctuation please.");
		String text = sc.nextLine();
		String text2;
		System.out.println("I have rephrased that line to read:");
		//ù ���� ��ġ ã��
		int n = text.indexOf(" ");
		// ���ڿ��� �ܾ� 2�� �̻����� �̷�� ���� �� 
		if(n>=0) {
			// ù���� ��ġ �������� �ڸ� ���ڿ� �ΰ� ��ġ �ٲٰ� ��� ���� �߰� 
			text2 = text.substring(n)+" "+text.substring(0,n);
			//�� �� ���� ����
			text2 = text2.trim();
			//ù ���� �빮�ڷ� ������ ������ �̾� ���̱�
			text2 = text2.substring(0,1).toUpperCase()+text2.substring(1);
			System.out.println(text2);
		}
		//���ڿ��� �ܾ� �Ѱ��� �̷�� ���� �� 
		else {
			//ù ���� �빮�ڷ� ������ ������ �̾� ���̱�
			text = text.substring(0,1).toUpperCase()+text.substring(1);
			System.out.println(text);
		}
		sc.close();
	}
}
