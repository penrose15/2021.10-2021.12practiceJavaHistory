package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentlee = new Student(1001, "Lee");  //������ ȣ��
		studentlee.addSubject("����", 100); //�迭�� �߰��� ����
		studentlee.addSubject("����", 80);  //�迭�� �߰� �� ����
		
		Student studentkim = new Student(1002,"kim");
		studentkim.addSubject("����", 70);
		studentkim.addSubject("����", 80);
		studentkim.addSubject("����", 100);
		
		studentlee.showStudentInfo();
		System.out.println("======================");
		studentkim.showStudentInfo();

	}

}
