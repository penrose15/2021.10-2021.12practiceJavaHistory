package object2;

class Student{
	int studentid;
	String studentName;


public Student(int studentid,String studentName) {
	this.studentid = studentid;
	this.studentName = studentName;
}

public String toString() {
	return studentid+ " , "+ studentName;
}
}

public class EqualTest {
	public static void main(String[] args) {
		Student studentlee = new Student(101, "이상원");
		Student studentkim = studentlee;
		Student studentchoi = new Student(101, "이상원");
		
		
		if (studentlee == studentkim)
			System.out.println("주소가 동일하다");
		else
			System.out.println("주소가 동일하지 않다");
		
		if(studentlee == studentchoi)
			System.out.println("주소가 동일하다");
		else
			System.out.println("주소가 동일하지 않다");
		
		if(studentlee.equals(studentkim))
			System.out.println("동일하다");
		else
			System.out.println("동일하지 않다");
		if(studentlee.equals(studentchoi))
			System.out.println("동일하다");
		else
			System.out.println("동일하지 않다");
		
		//equals()의 기능은 두 인스턴스 주소를 비교하는 것이다. 단, String()와 integer()의 경우 같은 값으로 재정의되어있음

	}

}
