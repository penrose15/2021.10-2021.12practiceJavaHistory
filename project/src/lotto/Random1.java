package lotto;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		
		int[] rndArr = new int[7];
		Random rnd = new Random();
		
		for(int i=0; i<7;i++) {
			rndArr[i] = (rnd.nextInt(44)+1);
		}
		for (int i=0;i<6;i++ ) {
			System.out.print(rndArr[i]);
			System.out.print(", ");
		}
		System.out.print("+ "+rndArr[6]);
	}

}
