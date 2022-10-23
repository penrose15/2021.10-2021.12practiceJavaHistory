package array;

public class TwoDiPract {

	public static void main(String[] args) {
		char[][] alphabets = new char[2][13];
		char ch = 'a';
		
		for(int i=0; i<alphabets.length;i++) {
			for(int j=0; j<alphabets[i].length; j++,ch++) {
				alphabets[i][j] = ch;
				
			}
		}
		
		for(int i=0; i<alphabets.length;i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				System.out.print(alphabets[i][j]+","+((int)alphabets[i][j])+" ");
			}
			System.out.println();
		
		

	}
	}
}


