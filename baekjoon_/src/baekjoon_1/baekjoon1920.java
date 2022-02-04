package baekjoon_1;
import java.io.*;
public class baekjoon1920 {
	public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
        String[] str2 = str.split(" ");
        int n1 = Integer.parseInt(str2[0]);
        int n2 = Integer.parseInt(str2[1]);
        int[] n = new int[n1+1];
        int i=0;
        int i_c=0;
        int count=0;
        while(true){
            while(i_c<n2) {
            	i_c++;
            	i++;
            	if(i>n1){
                    i=i-n1;
                }
            	while(n[i]==i){
                    i++;
                    if(i>n1){
                        i=1;
                    }
                }
            }
            n[i] = i;
            i_c=0;
            System.out.println(n[i]);
            count++;
            if(count==n1) {
            	break;
            }
        }
    }
}
