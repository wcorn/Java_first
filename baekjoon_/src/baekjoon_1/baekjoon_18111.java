package baekjoon_1;
import java.io.*;
public class baekjoon_18111 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[][] block;
	static int count=0;
	public static void main(String[] args) throws IOException{
		String str = br.readLine();
		String[] str2 = str.split(" ");
		int n1 = Integer.parseInt(str2[0]);
		int n2 = Integer.parseInt(str2[1]);
		int n3 = Integer.parseInt(str2[2]);
		block = new int[n1][n2];
		int max=0;
		int min=256;
		int min_count=0;
		int max_count=0;
		for(int i=0;i<n1;i++) {
			String s = br.readLine();
			String[] s2 = str.split(" ");
			for(int j=0;j<n2;j++) {
				block[i][j] = Integer.parseInt(s2[j]);
				max = Math.max(max, block[i][j]);
				min = Math.min(min, block[i][j]);
			}
		}
		
	}
}
