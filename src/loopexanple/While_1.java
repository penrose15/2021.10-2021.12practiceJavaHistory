package loopexanple;

public class While_1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <=10) {
			sum=sum+num;
			num++;
			if (num>=11) {
				System.out.println(sum);
				break;
			}
		}
	}

}
