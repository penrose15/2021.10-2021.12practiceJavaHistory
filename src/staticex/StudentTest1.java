package staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		Student ha = new Student("������");
		System.out.println(Student.studentID);
		System.out.println(ha.grade);
		ha.studentID++;
		
		Student lee = new Student("������");
		System.out.println(Student.studentID);
		System.out.println(lee.grade);
		lee.studentID++;
		
	}

}
