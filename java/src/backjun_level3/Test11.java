package backjun_level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//x보다 작은수 출력
public class Test11 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;
			st=new StringTokenizer(br.readLine());
			int count = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			st=new StringTokenizer(br.readLine());
			int[] number = new int[count];
			for(int i=0;i<count;i++) {
				number[i]=Integer.parseInt(st.nextToken());
				if(number[i]<x) {
					bw.write(number[i]+" ");
				}
			}
			
			bw.flush();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


