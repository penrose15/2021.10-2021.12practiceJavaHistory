package ifElsePrac;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		System.out.println("나이를 입력하세요:");
		Scanner s = new Scanner(System.in);
		double age = s.nextInt();
		int charge;
		
		if(age<8) {
			charge = 1000;
			System.out.println("취학전 아동입니다.");	
		}
		else if(age<14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if(age<20) {
			charge = 3000;
			System.out.println("중, 고등학생입니다.");	
		}
		else if(age>=65) {
			charge = 0;
			System.out.println("경로우대입니다.");
		}
		else {
			charge=4000;
			System.out.println("일반인입니다.");
		}
		System.out.println("입장료는"+charge+"원입니다.");

	}

}
