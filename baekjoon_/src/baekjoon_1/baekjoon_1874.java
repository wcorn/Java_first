package baekjoon_1;
import java.io.*;
public class baekjoon_1874 {
	static int []stack;
	static int []exam;
	static int count=0;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static String push(int n) {
		stack[count] = n;
		count++;
		return "+\n";
	}
	static int pop() {
		return stack[--count];
	}
	public static void main(String[] args)throws IOException{
		int num = Integer.parseInt(br.readLine());
		stack = new int[num];
		exam = new int[num];
		int k=1;
		int count_=0;
		for(int i=0;i<num;i++) {
			exam[i] = Integer.parseInt(br.readLine());
			while(k<=exam[i]) {
				sb.append(push(k));
				k++;
			}
			int a = pop();
			if(exam[i]!=a) {
			count_++;
			}
			sb.append("-\n");
		}
		if(count_!=0) {
			sb.delete(0, num*5);
			sb.append("NO");
		}
		bw.write(sb.toString());
		bw.flush();
	}
}