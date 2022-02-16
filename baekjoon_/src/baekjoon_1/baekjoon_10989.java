package baekjoon_1;
import java.io.*;
public class baekjoon_10989 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int[] n = new int[num];
		int[] k = new int[10001];
		for(int i=0;i<num;i++) {
			n[i] = Integer.parseInt(br.readLine());
			k[n[i]]++;
		}
		for(int i=0;i<k.length;i++) {
			if(k[i]==0) {
				continue;
			}
			else {
				for(int j=0;j<k[i];j++) {
				sb.append(i).append("\n");
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
