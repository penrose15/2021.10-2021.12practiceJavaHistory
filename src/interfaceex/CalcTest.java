package interfaceex;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		
		CompleteCalc calc = new CompleteCalc();
		
		
        Scanner sc = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();
		String a = b.next();
		int num2 = sc.nextInt();
		
		if (calc.A(a).equals("+")) {
			System.out.println(calc.add(num1, num2));
		}
		else if (calc.A(a).equals("-")) {
			System.out.println(calc.substract(num1, num2));
		}
		else if (calc.A(a).equals("*")) {
			System.out.println(calc.times(num1, num2));
		}
		else if (calc.A(a).equals("/")) {
			System.out.println(calc.divide(num1, num2));
		}
		else if (calc.A(a).equals("^")) {
			System.out.println(calc.square(num1, num2));
		}
		else {
			System.out.println("¤·¤·");
		}
		
		
		
		/*System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.square(num1, num2));
		calc.showInfo();*/
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
		
		calc.description();
		
		
		
		
		
		
		

	}

}
