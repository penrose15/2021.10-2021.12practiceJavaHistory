package function;

public class Functiontest1 {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 5;
		
		int a = add(num1, num2);
		System.out.println(a);

	}
	public static int add(int n1 , int n2) {
		int result = n1+n2;
		return result;
	}
	public static int minus(int n1, int n2) {
		int result = n1-n2;
		return result;
	}
	public static int mul(int n1, int n2) {
		int result = n1*n2;
		return result;
	}
	public static int div(int n1, int n2) {
		int result = n1/n2;
		return result;
	}

}
