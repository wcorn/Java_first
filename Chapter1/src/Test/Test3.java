package Test;
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2[] = str.split(" ");
        int in1 = Integer.parseInt(str2[0]);
        int in2 = Integer.parseInt(str2[1]);
        char[][] arr = new char[in1][in2];
        char[][] by = new char[8][8];
        for(int i=0; i<in1;i++){
            String str3 = sc.nextLine();
            char[] bi = str3.toCharArray();
            for(int j=0; j<str3.length();j++) {
            	arr[i][j] = bi[j];
            }
        }    
        
	}
	
}



