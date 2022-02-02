package baekjoon_1;
import java.io.*;
public class Baekjoon2609 {
		public static void main(String[] args)throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
	        String[] str2 = str.split(" ");
	        int n1 = Integer.parseInt(str2[0]);
	        int n2 = Integer.parseInt(str2[1]);
	        int min;
		    min=(n1>n2 ? n2 : n1);
		    int LCM = min, GCD;
		    for(int i=min;i>0;i--) {
		        if(n1%i==0 && n2%i==0){
		            LCM = i;
		            break;
		        }
		    }
		    GCD = n1/LCM*n2;
		    System.out.println(LCM);
		    System.out.println(GCD);
}
}
