package baekjoon_1;
import java.io.*;
public class baekjoon_1436{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int k=666;
        int count=0;
        while(true){
        	int a = k;
            while(a>0){
                int counto=0;
                if(a%10==6){
                    counto++;
                }
                else if(a%10!=6){
                    counto=0;
                }
                a/=10;
                if(counto==3){
                    count++;
                    break;
                }
            }
            if(n==count){
                break;
            }
            k++;
        }
        String str = Integer.toString(k);
        bw.write(str);
        bw.flush();
        bw.close();
        br.close();
    }
}