package backjun_level3;

import java.util.Scanner;
// 1부터 n까지의 합 출력
public class Test3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum= sum+i;
		}
		System.out.println(sum);
		scanner.close();
	}
	
}
