package backjun_level1;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a>1000 || a<100 || b>1000 || b<100) {
			a = scanner.nextInt();
			b = scanner.nextInt();
		}
		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100 - b%10)/10);
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
		
		scanner.close();
	}

}
