package staticex;

public class Student {
	public static int serialNum = 1000;
	public static int studentID = 10000;
	public String studentName;
	public static int grade = 1;
	public String address;
	
	public Student() { }
	
	
	public Student(String name) {
		this.studentName = name;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	

}
