package baekjoon_1;
import java.io.*;
public class ddd {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		Long num = Long.parseLong(br.readLine());
		Long k=1L;
		for(int i=1;i<=num;i++) {
			k*=i;
		}
		sb.append(k);
		bw.write(sb.toString());
		bw.flush();
	}
}