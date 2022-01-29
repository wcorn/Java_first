package Test;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        sc.close();
        int a = sc.nextInt();
        int cnt=1;
        for(int i=1;i>0;i++){
            for(int j=i, k=1; j>0;j--,k++){
                    if(cnt==a){
                    	if(i%2==1) {
                    		System.out.println(j+"/"+k);
                    	}
                    	else if(i%2==0) {
                    		System.out.println(k+"/"+j);
                    	}
                        return;
                    }
                    cnt++;
                
            }
        }
	}
}
