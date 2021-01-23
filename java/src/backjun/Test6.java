package backjun;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0,b = 0,c =0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if(a<2 || a >10000 || b<2 || b >10000 || c<2 || c >10000) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
		}
		System.out.println((a+b)%c);
		System.out.println((a%c+b%c)%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
		scanner.close();
	}
}

