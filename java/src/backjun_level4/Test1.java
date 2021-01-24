package backjun_level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test1 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			int a ,b, sum =0;
			do {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				sum =a+b;
				if(sum==0) {
					break;
				}
				bw.write(sum +"\n");
			}while(a+b!=0);
			
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
