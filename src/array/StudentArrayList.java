package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>( );
		
		student.add(new Student(1001,"james"));
		student.add(new Student(1002,"tomas"));
		student.add(new Student(1003,"edward"));
		
		for(Student s : student) {
			s.showStudentInfo();
		}

	}

}
