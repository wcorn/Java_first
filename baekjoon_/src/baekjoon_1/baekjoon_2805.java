package baekjoon_1;
import java.io.*;
public class baekjoon_2805 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static 	int[] n;
	static int mission;
	static int total;
	static int max=0;
	static long binarySearch() {
		long left = 0;
		long right = max;
		while(left<=right) {
			long count = 0;
			long mid = (left+right)/2;
			for(int i=0;i<total;i++) {
				if((n[i]-mid)>0) {
					count=count+n[i]-mid;
				}
			}
			if(count>=mission) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return right;
	}
	public static void main(String[] args) throws IOException{
		String num = br.readLine();
		String[] num_c = num.split(" ");
		total = Integer.parseInt(num_c[0]);
		mission = Integer.parseInt(num_c[1]);
		n = new int[total];
		String high = br.readLine();
		String[] high_c = high.split(" ");
		for(int i=0;i<total;i++) {
			n[i] = Integer.parseInt(high_c[i]);
			max = Math.max(max, n[i]);
		}
		sb.append(binarySearch());
		bw.write(sb.toString());
		bw.flush();
	}
}
