package backjun_level2;

import java.util.Scanner;
// 알람
public class Test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int min = scanner.nextInt();
		
		if(min-45<0) {
			hour=hour-1;
			if(hour<0) {
				hour = 24-1;
			}
			min=60-(45-min);
		}else {
			min=min-45;
		}
		System.out.print(hour+" ");
		System.out.print(min);
		
		scanner.close();
	}
}
