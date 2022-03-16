package baekjoon_1;
import java.io.*;
public class baekjoon_11399 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static int[] time;
	static int[] copy;
	static void merge(int left,int mid, int right) {
		int i,j,k,l;
		i=left;
		j=mid+1;
		k=left;
		while(i<=mid&&j<=right) {
			if(time[i]<time[j]) {
				copy[k++] = time[i++];
			}
			else {
				
			}
		}
	}
	static void merge_sort(int left, int right) {
		int mid;
		if(left<right) {
			mid = (left+right)/2;
			merge_sort(left,mid);
			merge_sort(mid+1,right);
			merge(left,mid,right);
		}
	}
	public static void main(String[] args)throws IOException {
		int num = Integer.parseInt(br.readLine());
		time = new int[num];
		copy = new int[num];
		String str = br.readLine();
		String[] str2 = str.split(" ");
		for(int i=0;i<num;i++) {
			time[i] = Integer.parseInt(str2[i]);
		}
		merge_sort(0,num-1);
	}
}
