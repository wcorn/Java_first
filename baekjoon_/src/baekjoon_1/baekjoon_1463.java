package baekjoon_1;
import java.io.*;
public class baekjoon_1463 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		if(n==1) {
			sb.append(0);
		}
        else if(n==2||n==3) {
        	sb.append(1);
        }
        else{
        int[] dp = new int[n+1];		
        for(int i=1;i<=n;++i) {
        	dp[i]=1000001;               
        }
		dp[1] = 0;
		dp[2] = 1;
		dp[3] = 1;
    	for(int i = 4; i<=n; i++) {
    		if(i%3==0)
    			dp[i] = Math.min(dp[i/3]+1, dp[i]);
    		if(i%2==0)
    			dp[i] = Math.min(dp[i/2]+1, dp[i]);
    		dp[i] = Math.min(dp[i-1] + 1,dp[i]);    			
    	}
    	sb.append(dp[n]);
        }
		bw.write(sb.toString());
		bw.flush();
	}
}
