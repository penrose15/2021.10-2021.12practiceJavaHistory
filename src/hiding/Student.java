package hiding;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() { //private ������ studentName�� ������ ���� �������� get()
		return studentName;
	}
	public void setStudentName(String studentName) {  //private ������ studentName�� ������ ���� �����ϴ� public set()�޼���
		this.studentName = studentName;
	}

}
