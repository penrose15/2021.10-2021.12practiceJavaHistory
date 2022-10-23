package function;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {  //학생이름 반환하는 메서드
		return studentName; //get로 학생이름을 가져옴
	}
	
	/*public void setStudentName(String name) {  //학생 이름을 매개변수로 지정
		studentName = name;  //name을 studentName 에 대입하여 학생이름 지정, set로 지정
	}
	*/
	public static void main(String[] args) {
		Student studentHong = new Student();
		studentHong.studentName="홍성주";
		System.out.println(studentHong.studentName);
		System.out.println(studentHong.getStudentName());
	}
}
	


