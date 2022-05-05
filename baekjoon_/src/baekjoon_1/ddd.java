package baekjoon_1;
import java.io.*;
public class ddd {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
//		int num = Integer.parseInt(br.readLine());
		double k=0;
		double e = Math.E;// 자연상수
		k+=Math.pow(e, -6)*Math.pow(6, 2)/2;
//		for(int i=1;i<=num;i++) {
//			//팰토리얼 계산
//			fac*=i;
//			//f(x) 계산 후 더하기
//			k+=Math.pow(e, -6)*Math.pow(6, i)/fac;
//		}
//		//1-k값
		sb.append(k);
		bw.write(sb.toString());
		bw.flush();
	}
}