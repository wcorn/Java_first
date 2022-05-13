/*
 Program to read Integer and print sorted integer with mergesort
 Author: Dongseok K. Programmer
 E-mail Address: dsk0820@naver.com
 Programming Active Learning 1
 Last changed: May 12, 2022
 */
import java.util.*;
public class SortDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//공백 1개로 구분된 숫자 입력
		System.out.println("Enter the Positive Integer in the array(Separate into one space)");
		String inputdata = sc.nextLine();
		String[] str = inputdata.split(" ");
		for(int i=0;i<str.length;i++)
		{
			// 공백이 2개 이상이면 프로그램 종료
			if(str[i].equals("")||str[i].equals(" "))
			{
				System.out.println("Spaces were entered consecutively.");
				return;
			}
			char[] ch = str[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				// 0과 9사이의 값이 아니면 프로그램 종료
				if(ch[j]<48||ch[j]>57)
				{
					System.out.println("Contains invalid values.");
					return;
				}
			}
		}
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			// 문자열을 integer형태로 변환후 저장
			arr[i] = Integer.parseInt(str[i]);
		}
		// mergesort 생성
		MergeSort MS = new MergeSort(arr);
		// 정렬 전 배열 출력
		System.out.println("Array values before sorting");
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]+" ");
		}
		//mergesort 실행
		MS.sort();
		System.out.println("\nArray values after sorting");
		// 정렬 후 배열 출력
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]+" ");
		}
	}
}
