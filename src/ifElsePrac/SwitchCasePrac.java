package ifElsePrac;

import java.util.Scanner;

public class SwitchCasePrac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ��������:");
		int a = s.nextInt();
		String b = null;
		
		switch(a) {
		case 1 : b="�౹";
		break;
		case 2 : b="�����ܰ�";
		break;
		case 3 : b="�Ǻΰ�";
		break;
		case 4 : b="ġ��";
		break;
		case 5 : b="�ｺŬ��";
		break;
		}
		System.out.println(a+"�� "+b+"�Դϴ�.");

	}

}
