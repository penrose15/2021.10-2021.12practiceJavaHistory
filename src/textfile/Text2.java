package textfile;

import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String input = sc.nextLine();
			System.out.println(input);
		}
		sc.close();

	}
	

}

