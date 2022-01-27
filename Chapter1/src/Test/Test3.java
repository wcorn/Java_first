package Test;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int in = Integer.parseInt(str);
        int result=0;
        for(int i=in;i>=in-str.length()*9;i--){
            int k=i;
            int j=i;
            while(j>0){
                k+=j%10;
                j/=10;
            }
            if(in==k){
                result=i;
            }
        }
        System.out.println(result);
	}
	
}

