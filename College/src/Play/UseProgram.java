package Play;
import java.io.*;
import java.util.*;
public class UseProgram {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		int age = 0;
		String name = null;
		bw.write("Input Customer Data: ");
		bw.flush();
		String str = br.readLine();
		str =str.trim();
		String[] str2 = str.split(" ");
		age = Integer.parseInt(str2[0]);
		name = str2[1];
		Customer C = new Customer(name, age);
	}
}