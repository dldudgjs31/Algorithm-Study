package backjun_level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//별찍기2
public class Test10 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int count = Integer.parseInt(br.readLine());
			
			for(int i =1; i<=count;i++) {
				for(int k =1; k<=count;k++) {
					bw.write(" ");
				}
				for(int j =1;j<=i;j++) {
					bw.write("*");
				}
				bw.write("\n");
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


