package baekjoon_1;
import java.io.*;
public class baekjoon_1978 {
	 public static void main(String[] args)throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        String str = br.readLine();
	        String[] str2 = str.split(" ");
	        int count=0;
	        
	        int cnt=0;
	        for(int i=0;i<n;i++){
	            int num = Integer.parseInt(str2[i]);
	            for(int j=1;j<=(int)Math.sqrt(num);j++){
	                if(num%j==0&&j!=1){
	                    cnt++;
	                }
	            }
	            if(cnt>0){
	                cnt=0;
	            }
	            else{
	            	if(num==1) {
	            		continue;
	            	}

	                count++;
	            }
	         }
	        System.out.println(count);
	     }
}
