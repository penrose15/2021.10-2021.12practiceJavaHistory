package object;

public class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public String toString() {
		return studentID+ " , "+studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (this.studentID == std.studentID) {
				return true;
			}
			else return false;
		
	}
		return false;
	}
	@Override
	public int hashCode() {
		return studentID;
	}
	
	public class Equalstest {
		public static void main(String[] args) {
			Student studentlee = new Student(100, "�̻��");
			Student studentlee2 = studentlee;
			Student studentSang = new Student(100,"�̻��");
			
			if(studentlee == studentlee2) {
				System.out.println("studentlee�� studentlee2�� �ּҴ� ����");
			}
			else {
				System.out.println("studentlee�� studentlee2�� �ּҴ� �ٸ���");
			}
			if(studentlee.equals(studentlee2)) {
				System.out.println("���� �����ϴ�");
			}
			else {
				System.out.println("���� �ٸ���");
			}
			if (studentlee == studentSang) {
				System.out.println("���� �ּҴ� ����");
			}
			else {
				System.out.println("���� �ּҴ� �ٸ���");
			}
			if(studentlee.equals(studentSang)) {
				System.out.println("�����ϴ�");
			}
			else {
				System.out.println("�ٸ���");
			}
			System.out.println("studentlee�� hashCode : "+studentlee.hashCode());
			System.out.println("studentSang�� hashCode : "+studentSang.hashCode());
			
			System.out.println("studentlee�� �����ּҰ� : "+System.identityHashCode(studentlee));
			System.out.println("studentSang�� ���� �ּҰ�"+ System.identityHashCode(studentSang));
		}
	}
	
	

	
	

}
