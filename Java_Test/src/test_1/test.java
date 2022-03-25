package test_1;
import java.io.*;
public class test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static double[] num;
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
		double sub=0;
		num = new double[n];
		for(int i=0;i<n;i++) {
			num[i] = Double.parseDouble(br.readLine());
			sub+=num[i];
		}
		double mean = sub/n;
		mean/=100;
		double median;
		if(n%2==0) {
			median = num[(n+1)/2];
		}
		else {
			median = (num[n/2]+num[n/2+1])/2;
		}
		median/=100;
		double deviation=0;
		for(int i=0;i<n;i++) {
			deviation += Math.pow(mean-num[i]/100, 2);
		}
		deviation /=(n-1);
		deviation = Math.sqrt(deviation);
		int count=0;
		for(int i=0;i<n;i++) {
			if(num[i]/100>mean-deviation&&num[i]/100<mean+deviation) {
				count++;
			}
		}
		sb.append("sub : "+sub+"\n");
		sb.append("mean : "+mean+"\n");
		sb.append("median : "+median+"\n");
		sb.append("deviation : "+deviation+"\n");
		sb.append("count : "+count+"\n");
		bw.write(sb.toString());
		bw.flush();
	}

}
