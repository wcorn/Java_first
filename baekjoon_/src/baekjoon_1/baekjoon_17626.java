package baekjoon_1;
import java.io.*;
public class baekjoon_17626 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n+1];
		a[1] = 1;
		for(int i=2;i<n+1;i++) {
			int min = a[i-1]+1;
			for(int j=1;j*j<=i;j++) {
				min = Math.min(min,a[i-j*j]);
			}
			a[i] = min+1;
		}
		sb.append(a[n]);
		bw.write(sb.toString());
		bw.flush();
	}
}