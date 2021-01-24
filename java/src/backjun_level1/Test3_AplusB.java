package backjun_level1;

import java.util.Scanner;

public class Test3_AplusB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a , b =0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		if(a<0 || b>10) {
			a = scanner.nextInt();
			b = scanner.nextInt();
		}
		
		System.out.println(a+b);
		
		scanner.close();
	}
}

