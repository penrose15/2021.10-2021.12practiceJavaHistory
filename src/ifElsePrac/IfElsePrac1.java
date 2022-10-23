package ifElsePrac;

import java.util.Scanner;

public class IfElsePrac1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성별을 입력하세요:");
		String c = scanner.next();
		char gender = c.charAt(0);
		
		if(c=="F") {
			System.out.println("여성입니다.");
		}
		
		else {
			System.out.println("남성입니다");
		}

	}

}
