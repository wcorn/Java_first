package baekjoon_1;
import java.io.*;
public class baekjoon_1003 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] fib = new int[41];
	public static void main(String[] args) throws IOException {
		int num = Integer.parseInt(br.readLine());
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<=40;i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		for(int i=0;i<num;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n==0) {
				sb.append(1+" "+0+"\n");
			}
			else {
				sb.append(fib[n-1]+" "+fib[n]+"\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}
