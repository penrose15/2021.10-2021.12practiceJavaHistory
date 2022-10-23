package staticex;

public class Student2 {
	private static int serialNum=1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() { 
	serialNum+=10;
	studentID = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	public static int getSerialNum() {
		int i=10;
		//studentName="하현우"; Student2클래스의 멤버변수로, 인스턴스 생성시 만들어지는 인스턴스변수
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}

}
