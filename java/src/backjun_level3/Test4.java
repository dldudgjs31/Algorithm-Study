package backjun_level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//BufferedReader 와 BufferedWriter 을 활용한 합 출력
public class Test4 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int count = Integer.parseInt(br.readLine());
			int[] result=new int[count];
			
			for(int i=0;i<count;i++) {
				String first = br.readLine();
				String[] result1=new String[2];
				result1= first.split(" ");
				int a = Integer.parseInt(result1[0]);
				int b = Integer.parseInt(result1[1]);
				result[i]= a+b;
				bw.write(result[i]+"\n");
			}
			bw.flush();
			
			br.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
}

/* 타 방법 StringTokenizer 을 사용하여 풀이
 * StringTokenizer은 문자열을 구분점을 기준으로 분리하여 배열로 저장해주는 역할을 한다.
class Bakjoon {
        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            int TC = Integer.parseInt(br.readLine());
     
            for(int i=0; i<TC; i++) {
                st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                int sum = A+B;
     
                bw.write(sum + "\n");
            }
            bw.flush();
        }
    } 
 */
