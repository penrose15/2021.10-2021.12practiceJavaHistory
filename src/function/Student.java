package function;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {  //�л��̸� ��ȯ�ϴ� �޼���
		return studentName; //get�� �л��̸��� ������
	}
	
	/*public void setStudentName(String name) {  //�л� �̸��� �Ű������� ����
		studentName = name;  //name�� studentName �� �����Ͽ� �л��̸� ����, set�� ����
	}
	*/
	public static void main(String[] args) {
		Student studentHong = new Student();
		studentHong.studentName="ȫ����";
		System.out.println(studentHong.studentName);
		System.out.println(studentHong.getStudentName());
	}
}
	


