package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 jeun = new Student2();
		jeun.setStudentName("����ȣ");
		System.out.println(Student2.getSerialNum());
		System.out.println(jeun.studentName+"�й�: "+jeun.studentID);
		
		Student2 bang = new Student2();
		bang.setStudentName("����");
		System.out.println(Student2.getSerialNum()); //�ν��Ͻ� �������� ��밡���ϴ�
		System.out.println(bang.studentName+"�й�: "+bang.studentID);

	}

}
