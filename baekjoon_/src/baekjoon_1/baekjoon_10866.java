package baekjoon_1;
import java.io.*;
public class baekjoon_10866 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int n[] = new int[2*num];
		int top=num-1;
		int bottom=num;
		for(int i=0;i<num;i++) {
			String str = br.readLine();
			String[] str2 = str.split(" ");
			switch(str2[0]) {
				case "push_front":
					int pushNum_1 = Integer.parseInt(str2[1]);
					bottom--;
					n[bottom] = pushNum_1;
					break;
				case "push_back":
					int pushNum_2 = Integer.parseInt(str2[1]);
					top++;
					n[top] = pushNum_2;
					break;
				case "pop_front":
					if(bottom==top+1) {
						System.out.println(-1);
						break;
					}
					System.out.println(n[bottom]);
					bottom++;
					break;
				case "pop_back":
					if(bottom==top+1) {
						System.out.println(-1);
						break;
					}
					System.out.println(n[top]);
					top--;
					break;
				case "size":
					System.out.println(top-bottom+1);
					break;
				case "empty":
					if(top==bottom-1) {
						System.out.println(1);
					}
					else {
						System.out.println(0);
					}
					break;
				case "front":
					if(top==bottom-1) {
						System.out.println(-1);
					}
					else {
						System.out.println(n[bottom]);
					}
					break;
				case "back":
					if(top==bottom) {
						System.out.println(-1);
					}
					else {
						System.out.println(n[top]);
					}
					break;
					
			}
		}
	}
}