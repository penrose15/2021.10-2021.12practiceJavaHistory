package string;

public class StringTest1 {
	public static void main(String[] args) {
		String str1 = new String("국카스텐");
		String str2 = new String("국카스텐");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));  //문자열은 같으므로 true
		
		String str3 = "국카스텐";
		String str4 = "국카스텐";
		
		System.out.println(str3 == str4);  //국카스텐은 상수풀에 저장되어 있으므로 주소 값이 같다
		System.out.println(str3.equals(str4)); 

	}

}
