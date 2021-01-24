package backjun_level3;

import java.util.Scanner;
//구구단 출력
public class Test1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		
		for(int i = 1; i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan, i,dan*i);
		}
		
		scanner.close();
	}
	
}
