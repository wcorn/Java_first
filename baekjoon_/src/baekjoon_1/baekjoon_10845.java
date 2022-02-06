package baekjoon_1;
import java.io.*;
public class baekjoon_10845 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int n[] = new int[num];
		int top=-1;
		int bottom=0;
		for(int i=0;i<num;i++) {
			String str = br.readLine();
			String[] str2 = str.split(" ");
			switch(str2[0]) {
				case "push":
					int pushNum = Integer.parseInt(str2[1]);
					top++;
					n[top] = pushNum;
					break;
				case "pop":
					if(bottom==top+1) {
						System.out.println(-1);
						break;
					}
					System.out.println(n[bottom]);
					bottom++;
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
