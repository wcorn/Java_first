package baekjoon_1;
import java.io.*;
public class baekjoon_2108 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		long num = Long.parseLong(br.readLine());
		long[] n = new long[8001];
		long sum=0;
		long count=0;
		long max_count=0;
		long max_ = 0;
		long max=-8000;
		long min= 8000;
		int c=0;
		long sub=0;
		for(int i=0;i<num;i++) {
			int num_ = Integer.parseInt(br.readLine());
			n[num_+4000]++;
			sum+=num_;
		}
			sb.append(Math.round((double)sum/num));
			sb.append("\n");
		for(int i=0;i<=8000;i++) {
			count+=n[i];
			if(count>=(Math.round((double)num/2))) {
				sb.append(i-4000);
				sb.append("\n");
				break;
			}
		}
		for(int i=0;i<=8000;i++) {
			if(n[i]>0) {
				if(max_count==n[i]) {
					max_ = i-4000;
					max_count = n[i];
					c++;
					if(c==1) {
						sub = max_;
					}
				}
				else if(max_count<n[i]) {
					max_count = n[i];
					max_ = i-4000;
					c=0;
				}
				if(max<=i) {
					max = i-4000;
				}
				if(min>=i) {
					min = i-4000;
				}
			}
		}
		if(c==0) {
		sb.append(max_);
		sb.append("\n");
		}
		else {
			sb.append(sub);
			sb.append("\n");
			}
		sb.append(max-min);
		bw.write(sb.toString());
		bw.flush();
	}

}
