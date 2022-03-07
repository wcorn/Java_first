package baekjoon_1;
import java.io.*;
public class baekjoon_2606 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args)throws IOException {
		int num = Integer.parseInt(br.readLine());
		int time = Integer.parseInt(br.readLine());
		int[] n = new int[num+1];
		int[][] a = new int[num+1][2];
		int target = 1;
		int count=0;
		n[target]++;
		for(int i=1;i<time;i++) {
			String str = br.readLine();
			String[] str2 = str.split(" ");
			a[i][0] = Integer.parseInt(str2[0]);
			a[i][1] = Integer.parseInt(str2[1]);
		}
		for(int k=0;k<time;k++) {
			for(int i=1;i<=num;i++) {
				for(int j=0;j<2;j++) {
					if(a[i][j]==target) {
						target = a[i][1-j];
						n[target]++;
						break;
					}
				}
			}
			
		}
		for(int i=2;i<=num;i++) {
			if(n[i]>0) {
				count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
	}
}
