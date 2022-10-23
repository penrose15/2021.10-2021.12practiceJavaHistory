package ifElsePrac;

import java.util.Scanner;

public class IfElse_1 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("나이를 입력하세요:");
		int age = scanner.nextInt();

		if(age>=8) {
			System.out.println("초등학교 입학");
		}
		else {
			System.out.println("초등학교 입학 불가");
			
		}

	}

}
