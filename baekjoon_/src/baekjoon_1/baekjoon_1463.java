package baekjoon_1;
import java.io.*;
public class baekjoon_1463 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] a;	
	static int[] mis;
	static int i=0;
	static void mission(int k) {
		mis[i] = k%3;
		i++;
		mis[i] = k%2;
		i++;
		mis[i] = k-1;
		i++;
	}
	static int find(int n) {
		int num=1;
		int count=0;
		while(mis[i]!=n) {
			
		}
		return count;
	}
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		a = new int[n+1];
		mis = new int[n];
		sb.append(find(n));
		bw.write(sb.toString());
		bw.flush();
	}
}
