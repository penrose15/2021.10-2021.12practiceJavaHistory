package ifElsePrac;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		System.out.println("���̸� �Է��ϼ���:");
		Scanner s = new Scanner(System.in);
		double age = s.nextInt();
		int charge;
		
		if(age<8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");	
		}
		else if(age<14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if(age<20) {
			charge = 3000;
			System.out.println("��, ����л��Դϴ�.");	
		}
		else if(age>=65) {
			charge = 0;
			System.out.println("��ο���Դϴ�.");
		}
		else {
			charge=4000;
			System.out.println("�Ϲ����Դϴ�.");
		}
		System.out.println("������"+charge+"���Դϴ�.");

	}

}
