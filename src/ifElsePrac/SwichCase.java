package ifElsePrac;

import java.util.Scanner;

public class SwichCase {

	public static void main(String[] args) {
		
		System.out.println("몇등인가?:");
		Scanner s = new Scanner(System.in);
		int ranking = s.nextInt();
		char medalColor;
		
		switch(ranking) {
		case 1 : medalColor = 'G';
		break;
		case 2 : medalColor = 'S';
		break;
		case 3 : medalColor = 'B';
		break;
		default:
			medalColor = 'A';
		}
		System.out.println(ranking+"등 메달 색은 "+medalColor+"이다");
	}

}
