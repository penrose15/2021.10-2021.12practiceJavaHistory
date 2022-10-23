package allowance;

import java.util.Scanner;
import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~9까지 원하는 숫자를 입력하세요:");
		String input = sc.next();
		int money = Integer.parseInt(input);
		
		int[] rdArr = new int[10];
		Random rnd = new Random();
		
		for (int i=0;i<10;i++) {
			rdArr[i] = rnd.nextInt(9999);
		}
		
		switch(money) {
		case 0 : System.out.println(String.format("5"+"%04d",rdArr[0]));break;
		case 1 : System.out.println(String.format("13"+"%04d",rdArr[1]));break;
		case 2 : System.out.println(String.format("7"+"%04d",rdArr[2]));break;
		case 3 : System.out.println(String.format("8"+"%04d",rdArr[3]));break;
		case 4 : System.out.println(String.format("12"+"%04d",rdArr[4]));break;
		case 5 : System.out.println(String.format("9"+"%04d",rdArr[5]));break;
		case 6 : System.out.println(String.format("6"+"%04d",rdArr[6]));break;
		case 7 : System.out.println(String.format("8"+"%04d",rdArr[7]));break;
		case 8 : System.out.println(String.format("11"+"%04d",rdArr[8]));break;
		case 9 : System.out.println(String.format("10"+"%04d",rdArr[9]));break;
		}
		
		sc.close();
		System.exit(0);

	}

}
