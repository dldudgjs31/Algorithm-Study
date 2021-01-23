package backjun;

import java.util.Scanner;

public class Test5_abset {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a , b =0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		if(a<=1 || b>=10000) {
			a = scanner.nextInt();
			b = scanner.nextInt();
		}
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		scanner.close();
	}
}

