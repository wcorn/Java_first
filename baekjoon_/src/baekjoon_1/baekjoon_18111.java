package baekjoon_1;
import java.io.*;
public class baekjoon_18111 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[][] block;
	static int count=0;
	static int min=10000;
	static int sub=0;
	static int mis(int target,int n1,int n2) {
		int c = count;
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				if(block[i][j]>target) {
					c+=(block[i][j]-target)*2;
				}
				else if(block[i][j]<target) {
					c+=(target-block[i][j]);
				}
			}
		}
		return c;
	}
	public static void main(String[] args) throws IOException{
		String str = br.readLine();
		String[] str2 = str.split(" ");
		int n1 = Integer.parseInt(str2[0]);
		int n2 = Integer.parseInt(str2[1]);
		int n3 = Integer.parseInt(str2[2]);
		block = new int[n1][n2];
		int time=0;
		int high=0;
		for(int i=0;i<n1;i++) {
			String s = br.readLine();
			String[] s2 = s.split(" ");
			for(int j=0;j<n2;j++) {
				block[i][j] = Integer.parseInt(s2[j]);
				min = Math.min(min, block[i][j]);
				sub+=block[i][j];
			}
		}
		time = (sub+n3)*2;
		sub=time/(n1*n2)/2;	
		for(int i=min;i<=sub;i++) {
			int a = mis(i,n1,n2);
			if(time>=a) {
				time = a;
				high = i;
			}
		}
		sb.append(time+" "+high);
		bw.append(sb.toString());
		bw.flush();
	}
}
