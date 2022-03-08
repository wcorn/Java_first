package baekjoon_1;
import java.io.*;
public class baekjoon_2579 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] dp;
	static int[] n;
	public static void main(String[] args) throws IOException{
		int num = Integer.parseInt(br.readLine());
		n = new int[num+1];
		dp = new int[num+1];
		for(int i=1;i<=num;i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		if(num==1) {
			sb.append(n[1]);
			bw.write(sb.toString());
			bw.flush();
			return;
		}
		dp[1] = n[1];
		dp[2] = n[1]+n[2];
		for(int i=3;i<=num;i++) {
			dp[i] = Math.max(dp[i-3]+n[i-1]+n[i], dp[i-2]+n[i]);
		}
		bw.write(dp[num] + "\n");
		bw.flush();
		bw.close();
	}
}
