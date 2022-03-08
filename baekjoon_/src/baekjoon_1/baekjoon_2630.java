package baekjoon_1;
import java.io.*;
public class baekjoon_2630 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[][] block;
	static int w_Num;
	static int b_Num;
	static void find(int x,int x_m,int y, int y_m) {
		int ex = block[x][y];
		for(int i=x;i<x_m;i++) {
			for(int j=y;j<y_m;j++) {
				if(block[i][j]!=ex) {
					find(x,(x+x_m)/2,y,(y+y_m)/2);
					find(x,(x+x_m)/2,(y+y_m)/2,y_m);
					find((x+x_m)/2,x_m,y,(y+y_m)/2);
					find((x+x_m)/2,x_m,(y+y_m)/2,y_m);
					return;
				}
			}
		}
		if(ex==0) {
			w_Num++;
		}
		else {
			b_Num++;
		}
	}
	public static void main(String[] args)throws IOException {
		int line = Integer.parseInt(br.readLine());
		block = new int[line][line];
		for(int i=0;i<line;i++) {
			String str = br.readLine();
			String[] str2 = str.split(" ");
			for(int j=0;j<line;j++) {
				block[i][j] = Integer.parseInt(str2[j]);
			}
		}
		find(0,line,0,line);
		sb.append(w_Num+"\n"+b_Num);
		bw.write(sb.toString());
		bw.flush();
	}
}
