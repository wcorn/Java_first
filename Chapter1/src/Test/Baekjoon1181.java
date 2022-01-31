package Test;
import java.io.*;
public class Baekjoon1181 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] ch = new String[num];
		String cmp;
		// 입력 후 저장
		for(int i=0; i<num; i++) {
			ch[i] = br.readLine();
		}
		//길이 순서대로 저장 
		for(int i=0; i<num-1;i++) {
			for(int j=i+1;j<num;j++) {
				if(ch[i].length()>ch[j].length()) {
					cmp = ch[i];
					ch[i] = ch[j];
					ch[j] = cmp;
				}
				if(ch[i].length()==ch[j].length()) {
					if(ch[i].compareTo(ch[j])>0) {
						cmp = ch[i];
						ch[i] = ch[j];
						ch[j] = cmp;
					}
				}
			}
		}
		for(int i=0; i<num-1;i++) {
			if(ch[i].equals(ch[i+1])) {
				continue;
			}
			System.out.println(ch[i]);
		}
		System.out.println(ch[ch.length-1]);
	}
}



