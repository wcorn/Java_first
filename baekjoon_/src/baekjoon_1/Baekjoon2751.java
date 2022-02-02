package baekjoon_1;
import java.io.*;
public class Baekjoon2751 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] n = new int[num];
        int tmp;
        for(int i=0;i<num; i++) {
        	n[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<num-1;i++) {
        	for(int j=i+1;j<num;j++) {
        		if(n[i]>n[j]) {
        			tmp = n[i];
        			n[i] = n[j];
        			n[j] = tmp;
        		}
        	}
        	if(n[i]==n[i+1]) {
        		continue;
        	}
        	System.out.println(n[i]);
        }
        System.out.println(n[num-1]);
    }
}
