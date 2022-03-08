package baekjoon_1;
import java.io.*;
public class baekjoon_2606 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args)throws IOException {
		int num = Integer.parseInt(br.readLine());
		int time = Integer.parseInt(br.readLine());
		int[][] a = new int[time][2];
		boolean[] virus = new boolean[num+1];
		virus[1] = true;
		int count=0;
		for(int i=0;i<time;i++) {
			String str = br.readLine();
			String[] str2 = str.split(" ");
			a[i][0] = Integer.parseInt(str2[0]);
			a[i][1] = Integer.parseInt(str2[1]);
		}
		for(int j=0;j<=time;j++) {
			for(int i=0;i<time;i++){
				if(virus[a[i][0]]!=virus[a[i][1]]) {
					virus[a[i][0]] = true;
					virus[a[i][1]] = true;
				}
			}
		}
		for(int i=2;i<=num;i++) {
			if(virus[i]) {
				count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
	}
}
