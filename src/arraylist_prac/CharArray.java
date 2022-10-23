package arraylist_prac;

public class CharArray {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for (int i=0;i<26;i++) {
			alphabets[i] = ch;
			ch++;
		}
		for (int i=0; i<26;i++ ) {
			System.out.println(alphabets[i]+","+(int)alphabets[i]);
		}
		

	}

}
