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
		Student studentlee = new Student(101, "�̻��");
		Student studentkim = studentlee;
		Student studentchoi = new Student(101, "�̻��");
		
		
		if (studentlee == studentkim)
			System.out.println("�ּҰ� �����ϴ�");
		else
			System.out.println("�ּҰ� �������� �ʴ�");
		
		if(studentlee == studentchoi)
			System.out.println("�ּҰ� �����ϴ�");
		else
			System.out.println("�ּҰ� �������� �ʴ�");
		
		if(studentlee.equals(studentkim))
			System.out.println("�����ϴ�");
		else
			System.out.println("�������� �ʴ�");
		if(studentlee.equals(studentchoi))
			System.out.println("�����ϴ�");
		else
			System.out.println("�������� �ʴ�");
		
		//equals()�� ����� �� �ν��Ͻ� �ּҸ� ���ϴ� ���̴�. ��, String()�� integer()�� ��� ���� ������ �����ǵǾ�����

	}

}
