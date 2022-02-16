package baekjoon_1;
import java.io.*;
public class baekjoon_1654 {
	static int[] num;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static long binarySearch(long max,int K,int N) {
		long left =1;
		long right=max;
		long max_line=0;
		while(left<=right) {
			int count=0;
			long mid = (left+right)/2;
			for(int j=0;j<K;j++) {
				long a = num[j];
				long b = a/mid;
				count+=b;
			}
			if(count>=N) {
				left = mid+1;
				right = Math.max(right, mid);
			}
			else {
				right = mid-1;
			}
			if(count>=N&&max_line<mid) {
				max_line =  mid;
			}
		}
		return max_line;
	}
	public static void main(String[] args)throws IOException {
		String str = br.readLine();
		String[] str2 = str.split(" ");
		int K = Integer.parseInt(str2[0]);
		int N = Integer.parseInt(str2[1]);
		num = new int[K];
		long max=0;
		for(int i=0;i<K;i++) {
			num[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, num[i]);
		}
		sb.append(binarySearch(max,K,N));
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
}