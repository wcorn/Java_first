package baekjoon_1;
import java.io.*;
public class baekjoon_4949 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int count=1;
			int j=0;
			String str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			char[] k = str.toCharArray();
			char[] n = new char[k.length+1];
			for(int i =0;i<k.length;i++) {
				if(k[i]=='['||k[i]=='(') {
					n[count]=k[i];
					count++;
				}
				else if(k[i]==']') {
					count--;
					if(n[count]!='[') {
						sb.append("no\n");
						j++;
						break;
					}
				}
				else if(k[i]==')') {
					count--;
					if(n[count]!='(') {
						sb.append("no\n");
						j++;
						break;
					}
				}
			}
			if(count==1&&j==0) {
				sb.append("yes\n");
			}
			else if(count>1&&j==0) {
				sb.append("no\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
	}
}