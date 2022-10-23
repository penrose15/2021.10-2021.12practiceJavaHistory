package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 jeun = new Student2();
		jeun.setStudentName("전규호");
		System.out.println(Student2.getSerialNum());
		System.out.println(jeun.studentName+"학번: "+jeun.studentID);
		
		Student2 bang = new Student2();
		bang.setStudentName("김기범");
		System.out.println(Student2.getSerialNum()); //인스턴스 생성없이 사용가능하다
		System.out.println(bang.studentName+"학번: "+bang.studentID);

	}

}
