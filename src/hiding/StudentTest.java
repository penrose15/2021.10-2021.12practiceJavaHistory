package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentlee = new Student();
		//studentlee.studentName = "������";  private�� �پ� �ܺ� Ŭ���� ������ �ȵ�
		studentlee.setStudentName("������");
		
		System.out.println(studentlee.getStudentName());

	}

}
