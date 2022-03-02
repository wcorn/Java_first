package baekjoon_1;
import java.io.*;
public class baekjoon_17219 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		String str = br.readLine();
		String[] str2 = str.split(" ");
		int n1 = Integer.parseInt(str2[0]);
		int n2 = Integer.parseInt(str2[1]);
		String[][] in_1 = new String[n1][2];
		for(int i=0;i<n1;i++) {
			String n = br.readLine();
			in_1[i] = n.split(" ");
		}
		for(int i=0;i<n2;i++) {
		}
	}
}
