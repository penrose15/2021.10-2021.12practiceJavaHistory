package staticex;

public class StudentTest {

	public static void main(String[] args) {
		Student studentlee = new Student();
		studentlee.setStudentName("이정길");
		System.out.println(studentlee.serialNum);
		studentlee.serialNum++;
		
		Student studentHa = new Student();
		studentHa.setStudentName("하현우");
		System.out.println(studentHa.serialNum);
		System.out.println(studentlee.serialNum);

	}

}
