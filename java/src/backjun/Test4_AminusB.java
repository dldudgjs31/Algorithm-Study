package backjun;

import java.util.Scanner;

public class Test4_AminusB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a , b =0;
		double c =0.00000000000000d;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = a/b;
		if(a<0 || b>10) {
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			c = a/b;
		}
		
		System.out.println(c);
		
		scanner.close();
	}
}

