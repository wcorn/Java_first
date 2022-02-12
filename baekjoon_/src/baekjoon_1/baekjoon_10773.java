package baekjoon_1;
import java.io.*;
public class baekjoon_10773 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int[] n = new int[num]; 
		int top=0;
		int sum=0;
		for(int i=0;i<num;i++) {
			int k = Integer.parseInt(br.readLine());
			if(k==0) {
				top--;
			}
			if(k!=0) {
				n[top] = k;
				top++;
			}
		}
		for(int i=0;i<top;i++) {
			sum+=n[i];
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
	}

}
