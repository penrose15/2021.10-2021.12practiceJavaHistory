package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentlee = new Student();
		//studentlee.studentName = "이정길";  private가 붙어 외부 클래스 접근이 안됨
		studentlee.setStudentName("이정길");
		
		System.out.println(studentlee.getStudentName());

	}

}
