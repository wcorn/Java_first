package baekjoon_1;
import java.io.*;
public class baekjoon_9095 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] n;
	static int[] T;
	public static void main(String[] args) throws IOException{
		int num = Integer.parseInt(br.readLine());
		int max=0;
		n = new int[num];
		for(int i=0;i<num;i++) {
			n[i] = Integer.parseInt(br.readLine());
			max = Math.max(n[i], max);
		}
		T = new int[max+1];
		T[1] = 1;
		T[2] = 2;
		T[3] = 4;
		for(int i=4;i<=max;i++) {
			T[i] = T[i-1]+T[i-2]+T[i-3];
		}
		for(int i=0;i<num;i++) {
			sb.append(T[n[i]]+"\n");
		}
		bw.append(sb.toString());
		bw.flush();
	}
}
