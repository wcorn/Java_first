package baekjoon_1;
import java.io.*;
public class baekjoon_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String[] str2 = str.split(" ");
		int coin_num = Integer.parseInt(str2[0]);
		int price = Integer.parseInt(str2[1]);
		int count=0;
		int[] coin = new int[coin_num];
		for(int i=0;i<coin_num;i++)
		{
			String str3 = br.readLine();
			coin[i] = Integer.parseInt(str3);
		}
		for(int i=coin_num-1;i>=0;i--)
		{
			count+=price/coin[i];
			price = price - (price/coin[i])*coin[i];
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		}
}
