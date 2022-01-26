package Test;

import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        char[] arr = str.toCharArray();
        int[] a = new int[26];
        int max=0;
        int max2=0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            a[arr[i]-65]++;
        }
        for (int i = 0; i < 26; i++){
                if(max < a[i]&&max2<a[i]){
                    max = a[i];
                    max2 = a[i];
                    count = i;
                }

                else if(max == a[i]){
                    max = 0;
                }
        }
        if(max == 0) System.out.print("?");
        else {System.out.print((char)(count + 65));}
    }
}