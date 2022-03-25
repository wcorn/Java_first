package test_1;
import java.io.*;
public class test_2{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String[] str2 = str.split(" ");
        char[] ch1  = str2[0].toCharArray();
        char[] ch2  = str2[1].toCharArray();
        int[] n1 = new int[10001];
        int[] n2 = new int[10001];
        int[] result = new int[10002];
        int max=Integer.max(ch1.length, ch2.length);
        for(int i=0;i<ch1.length;i++) {
        	n1[i] = (int)(ch1[ch1.length-1-i])-48;
        }
        for(int i=0;i<ch2.length;i++) {
        	n2[i] = (int)(ch2[ch2.length-1-i])-48;
        }
        for(int i=0;i<max;i++) {
        	if(n1[i]+n2[i]>=10) {
        		result[i]+=(n1[i]+n2[i]-10);
        		result[i+1]++;
        	}
        	else {
        		result[i]+=(n1[i]+n2[i]);
        	}
        	if(result[i]>=10) {
        		result[i]-=10;
        		result[i+1]++;
        	}
        }
        if(result[max]==0) {
        	max--;
        }
        if(result[max+1]!=0) {
        	max++;
        }
        for(int i=max;i>=0;i--) {
        	sb.append(result[i]);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}