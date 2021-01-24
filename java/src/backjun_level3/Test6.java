package backjun_level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//자연수 n 거꾸로 찍기
public class Test6 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int n = Integer.parseInt(br.readLine());
			
			for(;n>0;n--) {
				bw.write(n+"\n");
			}
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


