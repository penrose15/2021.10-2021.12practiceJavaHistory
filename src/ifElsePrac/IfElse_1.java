package ifElsePrac;

import java.util.Scanner;

public class IfElse_1 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ���:");
		int age = scanner.nextInt();

		if(age>=8) {
			System.out.println("�ʵ��б� ����");
		}
		else {
			System.out.println("�ʵ��б� ���� �Ұ�");
			
		}

	}

}
