package baekjoon_1;
import java.io.*;
public class baekjoon_11723 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static boolean[] S = new boolean[21];
	static int n;
	static void add(){
		S[n]=true;
	}
	static void remove(){
		S[n]=false;
	}
	static void check(){
		if(S[n]==true) {
			sb.append(1+"\n");
		}
		else {
			sb.append(0+"\n");
		}
}
	static void toggle(){
		if(S[n]==true) {
			S[n]=false;
		}
		else {
			S[n]=true;
		}
}
	static void all(){
	for(int i=1;i<=20;i++) {
		S[i]=true;
	}
}
	static void empty(){
		for(int i=1;i<=20;i++) {
			S[i]=false;
		}
}
	public static void main(String[] args) throws IOException{
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			String str = br.readLine();
			String[] str2 = str.split(" ");
			switch(str2[0]) {
			case "add" :
				n = Integer.parseInt(str2[1]);
				add();
				break;
			case "remove" :
				n = Integer.parseInt(str2[1]);
				remove();
				break;
			case "check" :
				n = Integer.parseInt(str2[1]);
				check();
				break;
			case "toggle" :
				n = Integer.parseInt(str2[1]);
				toggle();
				break;
			case "all" :
				all();
				break;
			case "empty" :
				empty();
				break;
			default:
				break;
			}
		}
		bw.append(sb.toString());
		bw.flush();
	}
}
