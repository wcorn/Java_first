package HW2;
import java.util.*;
public class Problem_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		// 입력
		String num = sc.next();
		// 비트별로 나누고 정수형으로 변환 후 저장
		int n1 = Integer.parseInt(num.substring(0,1));
		int n2 = Integer.parseInt(num.substring(1,2));
		int n3 = Integer.parseInt(num.substring(2,3));
		int n4 = Integer.parseInt(num.substring(3,4));
		// 2진수로 변환 
		System.out.println(n1*8+n2*4+n3*2+n4*1);
		}
}