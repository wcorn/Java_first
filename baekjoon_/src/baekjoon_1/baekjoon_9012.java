package baekjoon_1;
import java.io.*;
public class baekjoon_9012 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            String str = br.readLine();
            char[] ch = str.toCharArray();
            int count=0;
            if(((ch.length)%2)!=0){
                System.out.println("NO");
                    continue;
            }
            for(int j=0;j<ch.length;j++){
                if(ch[j]=='('){
                    count++;
                }
                else if(ch[j] ==')'){
                    count--;
                }
                if(count<0){
                    System.out.println("NO");
                    break;
                }
            }
            if(count==0){
                System.out.println("YES");
            }
            else if(count>0) {
            	System.out.println("NO");
            }
            }
        }
	}
