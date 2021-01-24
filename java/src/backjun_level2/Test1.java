package backjun_level2;

import java.util.Scanner;
// 성적을 입력받아 성적으로 반환
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a<0 || a>100 ) {
			a = scanner.nextInt();
		}
		
		if(a>=90) {
			System.out.println("A");
		}else if (a>=80) {
			System.out.println("B");
		}else if (a>=70) {
			System.out.println("C");
		}else if (a>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		scanner.close();
	}
}
