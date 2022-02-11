package baekjoon_1;
import java.io.*;
import java.util.*;
public class baekjoon_7568 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		int[][] person = new int[num][2];
		int[] count = new int[num];
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			person[i][0] = Integer.parseInt(st.nextToken());
			person[i][1] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(person[i][0]<person[j][0]&&person[i][1]<person[j][1]) {
					count[i]++;
				}
			}
			sb.append(count[i]+1+" ");
		}
		bw.write(sb.toString());
		bw.flush();
	}

}
