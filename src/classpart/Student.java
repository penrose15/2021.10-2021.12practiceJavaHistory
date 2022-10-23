package classpart;

public class Student {
	int studentID;
	String  studentName;
	int grade;
	String address;  //클래스 내부에 선언하는 변수를 멤버 변수
	
	public void showStudentInfo() {
		System.out.println(studentName+" , "+address);
	}

}
