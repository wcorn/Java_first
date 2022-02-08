package baekjoon_1;
import java.io.*;
public class baekjoon_2164 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int n[] = new int[num*10];
		int back=num-1;
		int front=0;
		for(int i=0; i<num;i++) {
			n[i] = i+1;
		}
		while(front!=back) {
			front++;
//			System.out.println(back+" "+front+" "+n[back]);
			if(front==back) {
				break;
			}
			back++;
			n[back]=n[front];
			front++;
//			System.out.println(back+" "+front+" "+count+" "+n[back]);
		}
		System.out.print(n[back]);
	}
}
