package backjun_level2;

import java.util.Scanner;
// 두 숫자를 입력받아 비교
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a<-10000 || a>10000 ||b<-10000 || b>10000) {
			a = scanner.nextInt();
			b = scanner.nextInt();
		}

		if(a>b) {
			System.out.println(">");
		}else if (a<b) {
			System.out.println("<");
		}else if (a==b) {
			System.out.println("==");
		}
		
		scanner.close();
	}
}
