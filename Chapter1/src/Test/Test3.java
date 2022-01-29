package Test;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String str = sc.nextLine();
		        String[] str2 = str.split(" ");
		        int in1 = Integer.parseInt(str2[0]);
		        int in2 = Integer.parseInt(str2[1]);
		        if(in2==1) {
		        	System.out.println(in1);
		        }
		        else if(in2==0) {
		        	System.out.println(0);
		        }
		        else{
		        	System.out.println(cycle(in1-1,in2-1));
		        }
		        sc.close();
		    }
		    public static int cycle(int n1, int n2){
		        	if(n2>1&&n1>=n2){
		        		return cycle(n1-1,n2);
		        	}
		    }
	}



