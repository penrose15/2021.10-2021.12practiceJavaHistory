package calender;

import java.util.Scanner;


public class Calender1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ñ��Ͻ� ���� �Է��ϼ���");
		int input = sc.nextInt();
		
		int[] Maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (input>0 && input<13 && input !=2) {
			System.out.println(input+"���� �ִ� ��¥���� " + Maxdays[input-1]+"�Դϴ�");
		}
		
		
		else {
			System.out.println("1���� 12������ ���� �Է��ϼ���");
			
		}

	}

}
