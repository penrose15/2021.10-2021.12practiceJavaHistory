package object;

public class Student2 {
	int studentid;
	String studentName;
	
	public Student2(int studentid, String studentName) {
		this.studentid = studentid;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentid+","+studentName;
	}
	
	

}
