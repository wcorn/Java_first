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
        char[][] by1 = new char[8][8];
        char[][] by2 = new char[8][8];
        int count1;
        int count2;
        int min=2500;
        for(int i=0; i<in1;i++){
            String str3 = sc.nextLine();
            char[] bi = str3.toCharArray();
            for(int j=0; j<in2;j++) {
            	arr[i][j] = bi[j];
            }
        }  
        for(int i=0;i<8;i++) {
        	for(int j=0;j<8;j++) {
        		if((i%2==0&&j%2==0)||(i%2==1&&j%2==1)) {
        			by1[i][j] = 'B';
        			by2[i][j] = 'W';
        		}
        		else {
        			by1[i][j] = 'W';
        			by2[i][j] = 'B';
        		}
        	}
        }
        for(int i=0; i<=in1-8;i++){
            for(int j=0; j<=in2-8;j++) {
            	count1=0;
            	count2=0;
            		for(int k=0;k<8;k++) {
            			for(int h=0;h<8;h++) {
            				if(arr[i+k][j+h]!=by1[k][h]) {
            					count1++;
            				}
            			}
            		}
            		for(int k=0;k<8;k++) {
            			for(int h=0;h<8;h++) {
            				if(arr[i+k][j+h]!=by2[k][h]) {
            					count2++;
            				}
            			}
            		}
            	if(min>count1||min>count2) {
            		if(count1>count2) {
            			min = count2;
            		}
            		else {
            			min = count1;
            		}
            	}
            }
            
        }   
        System.out.println(min);
	}
	
}



