package staticex;

public class StudentTest {

	public static void main(String[] args) {
		Student studentlee = new Student();
		studentlee.setStudentName("������");
		System.out.println(studentlee.serialNum);
		studentlee.serialNum++;
		
		Student studentHa = new Student();
		studentHa.setStudentName("������");
		System.out.println(studentHa.serialNum);
		System.out.println(studentlee.serialNum);

	}

}
