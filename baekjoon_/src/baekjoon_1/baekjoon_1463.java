package baekjoon_1;
import java.io.*;
public class baekjoon_1463 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
<<<<<<< HEAD
	static int[] a;	
	static int find(int n) {
		int count=0;
		int num=1;
		int i=0;
		while(true) {
			int k = num;
			a[i] = k;
			if(a[i]==n) {
				break;
			}
=======
	static int[] mis;
	static int i=0;
	static void mission(int k) {
		mis[i] = k%3;
		i++;
		mis[i] = k%2;
		i++;
		mis[i] = k-1;
		i++;
	}
	static int find(int n) {
		int num=1;
		int count=0;
		while(mis[i]!=n) {
			
>>>>>>> 84b2b8d8be9fe3c194d815fb2e61c6bea5265aaa
		}
		return count;
	}
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(br.readLine());
<<<<<<< HEAD
		a = new int[n+1];
=======
		mis = new int[n];
>>>>>>> 84b2b8d8be9fe3c194d815fb2e61c6bea5265aaa
		sb.append(find(n));
		bw.write(sb.toString());
		bw.flush();
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 84b2b8d8be9fe3c194d815fb2e61c6bea5265aaa
