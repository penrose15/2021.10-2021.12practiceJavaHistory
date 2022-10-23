package test;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		while (true) {
		int[] rdArr = new int[10];
		Random rnd = new Random();
		
		 
		for (int i=0;i<10;i++) {
			rdArr[i] = rnd.nextInt(9999);
		}
		
		switch(0) {
		case 0 : System.out.println(String.format("5"+"%04d",rdArr[0]));
		case 1 : System.out.println(String.format("13"+"%04d",rdArr[1]));
		case 2 : System.out.println(String.format("7"+"%04d",rdArr[2]));
		case 3 : System.out.println(String.format("7"+"%04d",rdArr[3]));
		case 4 : System.out.println(String.format("7"+"%04d",rdArr[4]));
		case 5 : System.out.println(String.format("7"+"%04d",rdArr[5]));
		case 6 : System.out.println(String.format("7"+"%04d",rdArr[6]));
		case 7 : System.out.println(String.format("7"+"%04d",rdArr[7]));
		case 8 : System.out.println(String.format("7"+"%04d",rdArr[8]));
		case 9 : System.out.println(String.format("7"+"%04d",rdArr[9]));
		}
		
		}


	}

}
