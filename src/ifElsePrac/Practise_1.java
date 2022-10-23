package ifElsePrac;

public class Practise_1 {

	public static void main(String[] args) {
		int score = 90;
		char grade;
		
		if (score<100) {
			grade='A';
		}
		else if (score<90) {
			grade='B';
		}
		else if (score<80) {
			grade='C';
		}
		else if (score<70) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println(grade+"ÀÔ´Ï´Ù");
	}

}
