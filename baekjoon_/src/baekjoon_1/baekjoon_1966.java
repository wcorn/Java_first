package baekjoon_1;
import java.io.*;
public class baekjoon_1966 {
	static int[] queue;
	static int front=0;
	static int back=0;
	static int count=0;
	static int mission=0;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static void pop() {
		count++;
		front++;
	}
	static void mis() {
		if(front==mission) {
			mission+=back-front;
		}
		
		back++;
		queue[back] = queue[front];
		front++;
	}
	public static void main(String[] args) throws IOException{
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			String str = br.readLine();
			String[] str_c = str.split(" ");
			front=0;
			back=0;
			count=0;
			int n_1 = Integer.parseInt(str_c[0]);
			int n_2 = Integer.parseInt(str_c[1]);
			queue = new int[n_1*100];
			String str2 = br.readLine();
			String[] str2_c = str2.split(" ");
			for(int j=0;j<n_1;j++) {
				queue[j] = Integer.parseInt(str2_c[j]);
			}
			mission = queue[n_2];
			back = n_1-1;
			while(true) {
				int max=0;
				for(int k=front;k<=back;k++) {
					if(max<=queue[k]) {
						max = queue[k];
					}
				}
				if(queue[front]>=max) {
					if(mission == count) {
						sb.append(count+" count \n");
						break;
					}
					pop();
				}
				else {
					mis();
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
