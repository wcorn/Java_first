package baekjoon_1;
import java.io.*;
public class baekjoon_1929 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		String str = br.readLine();
		String[] str2 = str.split(" ");
		int min = Integer.parseInt(str2[0]);
		int max = Integer.parseInt(str2[1]);
		int[] num = new int[max+1];
			for(int i=2;i<=(int)Math.sqrt(max);i++){
				if(num[i]==0) {
					for(int j=2;j<=max/i;j++) {
						num[i*j]++;
					}
				}
            }
			for(int i=min;i<=max;i++) {
				if(i==1) {
					continue;
				}
				if(num[i]==0) {
					sb.append(i+"\n");
				}
			}
			bw.append(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
