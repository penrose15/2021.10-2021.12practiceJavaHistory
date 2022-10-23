package ifElsePrac;

import java.util.Scanner;

public class SwitchCasePrac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("층수를 누르세요:");
		int a = s.nextInt();
		String b = null;
		
		switch(a) {
		case 1 : b="약국";
		break;
		case 2 : b="정형외과";
		break;
		case 3 : b="피부과";
		break;
		case 4 : b="치과";
		break;
		case 5 : b="헬스클럽";
		break;
		}
		System.out.println(a+"층 "+b+"입니다.");

	}

}
