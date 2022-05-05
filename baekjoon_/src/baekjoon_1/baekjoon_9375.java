package baekjoon_1;
import java.io.*;
public class baekjoon_9375 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		int num = Integer.parseInt(br.readLine());
		int wear=0;
		String wearing[][];
		for(int i=0;i<num;i++)
		{
			wear = Integer.parseInt(br.readLine());
			wearing = new String[wear][2];
			for(int j=0;j<num;j++)
			{
				String str = br.readLine();
				String[] str2 = str.split(" ");
				wearing[j][0] = str2[1];
				wearing[j][1] = "0";
			}
			
		}
	}
}
