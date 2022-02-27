package baekjoon_1;
import java.io.*;
public class baekjoon_1463 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] a;	
	static int find(int n) {
		int count=0;
		int num=1;
		int i=0;
		while(true) {
			int k = num;
			a[i] = k;
			if(a[i]==n) {
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		a = new int[n+1];
		sb.append(find(n));
		bw.write(sb.toString());
		bw.flush();
	}
}
