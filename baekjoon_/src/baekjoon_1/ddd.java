package baekjoon_1;
import java.io.*;
public class ddd {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] S;
	static int top=0;
	static int n;
	static void add(){
		S[top] = n;
		top++;
	}
	static void remove(){
		int i=0;
		for(i=0;i<top;i++) {
			if(S[i]==n) {
				S[i]=0;
			}
		}
	}
	static void check(){
		int i;
		int k=0;
		for(i=0;i<top;i++) {
			if(S[i]==n) {
				sb.append(n+" "+1+"\n");
				k++;
			}
		}
		if(k==0){
			sb.append(n+" "+0+"\n");
		}
}
	static void toggle(){
		int k=0;
		for(int i=0;i<top;i++) {
			if(S[i]==n) {
				S[i]=0;
				k++;
			}
		}
		if(k==0){
			add();
		}
}
	static void all(){
		top = 20;
	for(int i=0;i<top;i++) {
		S[i] = i+1;
	}
}
	static void empty(){
	top=0;
}
	public static void main(String[] args) throws IOException{
		int num = Integer.parseInt(br.readLine());
		S = new int[num];
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