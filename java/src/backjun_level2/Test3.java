package backjun_level2;

import java.util.Scanner;
// 년도 입력후 윤년 여부 판별
public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a<1 || a>4000) {
			a = scanner.nextInt();
		}
		if((a%4==0 && a%100!=0) || a%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

		
		scanner.close();
	}
}
