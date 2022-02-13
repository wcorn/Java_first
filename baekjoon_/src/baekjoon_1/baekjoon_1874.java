package baekjoon_1;
import java.io.*;
public class baekjoon_1874 {
	static int[] exam;
	static int[] stack;
	static int stack_count=0;
	static int count_2=0;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static void push(int n) {
		stack[stack_count] = n;
		stack_count++;
		sb.append("+\n");
	}
	static int pop() {
		stack_count--;
		sb.append("-\n");
		return stack[stack_count];
	}
	public static void main(String[] args)throws IOException{
		int num = Integer.parseInt(br.readLine());
		exam = new int[num]; 
		stack = new int[num];
		int[] stack_ex = new int[num];
		for(int i=0;i<num;i++) {
			exam[i] = Integer.parseInt(br.readLine());
		}
		int stack_e=0;
		while(true) {
			while(exam[stack_e]>count_2) {
				count_2++;
				push(count_2);
				sb.append(exam[stack_e]+"\t"+count_2+"\t"+stack_e+"\n");
			}
			stack_ex[stack_e] = pop();
			sb.append(exam[stack_e]+"\t"+count_2+"\t"+stack_e+"\n");
			if(stack_ex[stack_e]!=exam[stack_e]) {
			break;
			}	
			stack_e++;
		}
		bw.write(sb.toString());
		bw.flush();
	}
}