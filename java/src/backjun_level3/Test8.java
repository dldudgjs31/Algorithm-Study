package backjun_level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//a+b 합 구하기
public class Test8 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int count = Integer.parseInt(br.readLine());
			StringTokenizer st;
			
			for(int i =1;i<=count;i++) {
				st = new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				int sum = a+b;
				bw.write("Case #"+i+": "+a+" + "+b+" = "+sum+"\n");
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


