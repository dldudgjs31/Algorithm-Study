package backjun_level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//a+b 합구하기
public class Test2 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			String str;
			while((str=br.readLine()) != null ) {
				st = new StringTokenizer(str," ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int sum =a+b;
				bw.write(sum +"\n");
			}
			
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
