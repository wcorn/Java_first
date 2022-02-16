package baekjoon_1;
import java.io.*;
public class baekjoon_10757{
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
        int max=Integer.max(ch1.length, ch1.length);
        for(int i=0;i<ch1.length;i++) {
        	n1[i] = (int)(ch1[ch1.length-1-i])-48;
        	sb.append(n1[i]+"\n");
        }
        for(int i=0;i<ch2.length;i++) {
        	n2[i] = (int)(ch2[ch2.length-1-i])-48;
        	sb.append(n2[i]+"\n");
        }
        for(int i=0;i<max+1;i++) {
        	if(n1[i]+n2[i]>=10) {
        		result[i]=n1[i]+n2[i]-10;
        		result[i+1]++;
        	}
        	else {
        		result[i]=n1[i]+n2[i];
        	}
        	sb.append(result[i]);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}