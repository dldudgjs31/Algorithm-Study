package backjun_level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//a+b 합 구하기
public class Test7 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int count = Integer.parseInt(br.readLine());
			StringTokenizer st;
			
			for(int i =1;i<=count;i++) {
				st = new StringTokenizer(br.readLine());
				int sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
				bw.write("Case #"+i+": "+sum+"\n");
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


