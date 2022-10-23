package calender;

import java.util.Scanner;

public class Calender2 {
	
	public int  MaxDays(int month) {
		int[] maxDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return maxDay[month-1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calender2 cal = new Calender2();
		
		System.out.println("달을 입력하세요");
		int month = sc.nextInt();
		
		System.out.printf("=======%02d=======",month);
		System.out.println(" ");
		System.out.println("sun mon tue wen thus fri sat");
		for (int i =1; i<=cal.MaxDays(month);i++) {
			System.out.printf("%3d",i);
			System.out.print(" ");
			if (i%7==0) {
				System.out.println(" ");
			}
			
		}
		
	}

}
