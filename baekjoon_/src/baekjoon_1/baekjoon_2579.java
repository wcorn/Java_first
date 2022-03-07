package baekjoon_1;
import java.io.*;
public class baekjoon_2579 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] dp;
	public static void main(String[] args) throws IOException{
		int num = Integer.parseInt(br.readLine());
		int[] n = new int[num+1];
		dp = new int[num+1];
		int a = num/3;
		for(int i=0;i<num;i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		dp[1] = n[1];
	}
}
