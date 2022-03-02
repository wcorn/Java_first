package baekjoon_1;
import java.io.*;
public class baekjoon_1676 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		int num = Integer.parseInt(br.readLine());
		int n_5=0;
		int result=0;
		for(int i=1;i<=num;i++) {
			if(i%5==0) {
				int a=i;
				while(a>=5&&a%5==0) {
					n_5++;
					a/=5;
				}
			}
		}
		result = n_5;
		sb.append(result);
		bw.write(sb.toString());
		bw.flush();
	}
}
