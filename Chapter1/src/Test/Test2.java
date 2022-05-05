package Test;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] ch = new String[num];
		String cmp;
		for(int i=0; i<num; i++) {
			ch[i] = sc.next();
		}
		for(int i=0; i<=num;i++) {
			for(int j=i+1;j<=num-1;j++) {
				if(ch[i].length()>ch[j].length()) {
					cmp = ch[i];
					ch[i] = ch[j];
					ch[j] = cmp;
				}
			}
		}
		for(int i=0; i<=num;i++) {
			for(int j=i+1;j<=num-1;j++) {
				if(ch[i].length()==ch[j].length()) {
					char[] ch1 = ch[i].toCharArray();
					char[] ch2 = ch[j].toCharArray();
					for(int k=0;k<num-1;) {
						if(ch1[k]>=ch2[k]) {
							System.out.println(i+" "+j+" "+ch[i]+" "+ch[j]);
							cmp = ch[i];
							ch[i] = ch[j];
							ch[j] = cmp;
							break;
						}
						else {
							break;
						}
					}
				}
			}
		}
		for(int i=0; i<num;i++) {
			System.out.println(ch[i]);
		}
	sc.close();
	}
}



