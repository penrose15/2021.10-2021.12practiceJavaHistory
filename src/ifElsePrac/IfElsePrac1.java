package ifElsePrac;

import java.util.Scanner;

public class IfElsePrac1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		String c = scanner.next();
		char gender = c.charAt(0);
		
		if(c=="F") {
			System.out.println("�����Դϴ�.");
		}
		
		else {
			System.out.println("�����Դϴ�");
		}

	}

}
