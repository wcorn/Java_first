package baekjoon_1;
import java.io.*;

public class ddd {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();		
			
		boolean[] arr = new boolean[2000001];
		
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
			
		}
		int size = arr.length;
		for(int i = 0; i < size; i++) {
			if(arr[i]) {
				sb.append((i - 1000000)).append('\n');
			}
		}
		
		System.out.print(sb);
	}
}
