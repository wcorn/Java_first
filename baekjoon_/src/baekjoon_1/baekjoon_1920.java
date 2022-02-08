package baekjoon_1;
import java.io.*;
public class baekjoon_1920{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        String str1 = br.readLine();
        String[] str1_1 = str1.split(" ");
        int[] num_1 = new int[num1];
        for(int i=0;i<num1;i++){
            num_1[i] = Integer.parseInt(str1_1[i]);
        }
        int num2 = Integer.parseInt(br.readLine());
        String str2 = br.readLine();
        String[] str2_1 = str2.split(" ");
        int[] num_2 = new int[num2];
        int count=0;
        for(int i=0;i<num2;i++){
            num_2[i] = Integer.parseInt(str2_1[i]);
            int lo=-1;
            int hi = num_2[i];
            while(lo+1<hi) {
            	int mid = (lo+hi)/2;
                System.out.println(hi+" "+lo+" "+" "+mid);
            	if(num_1[mid]<num_2[i]) {
            		lo = mid;
            	}
            	else {
            		hi = mid;
            	}
            }
            if(hi == num_2[i]){
            	count++;
            }
        }
    }
}