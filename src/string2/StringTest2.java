package string2;

public class StringTest2 {
	public static void main(String[] args) {
		String fuck = new String("fuck");
		String you = new String(" you");
		
		System.out.print(fuck+" ");
		System.out.println(System.identityHashCode(fuck));
		
		fuck = fuck.concat(you);
		System.out.print(fuck+" ");
		System.out.println(System.identityHashCode(fuck));

	}

}
