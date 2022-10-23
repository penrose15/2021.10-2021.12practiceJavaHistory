package calender;

import java.util.Scanner;


public class Calender1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("궁금하신 월을 입력하세요");
		int input = sc.nextInt();
		
		int[] Maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (input>0 && input<13 && input !=2) {
			System.out.println(input+"달의 최대 날짜수는 " + Maxdays[input-1]+"입니다");
		}
		
		
		else {
			System.out.println("1에서 12까지의 수를 입력하세요");
			
		}

	}

}
