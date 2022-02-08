package baekjoon_1;
import java.io.*;
public class baekjoon_10816 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num_1 = Integer.parseInt(br.readLine());
		String str_1 = br.readLine();
		String[] s_1 = str_1.split(" ");
		int[] n = new int[20000001];
		for(int i=0;i<num_1;i++) {
			n[Integer.parseInt(s_1[i])+10000000]++;
		}
		int num_2 = Integer.parseInt(br.readLine());
		int a;
		String str_2 = br.readLine();
		String[] s_2 = str_2.split(" ");
		StringBuilder ret = new StringBuilder(6*num_2);
		for(int i=0;i<num_2;i++) {
			ret.append(n[Integer.parseInt(s_2[i])+10000000]);
			ret.append(" ");
		}
		bw.write(ret.toString());
		bw.flush();
	}

}
