package object;

public class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	public String toString() {
		return studentID+ " , "+studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (this.studentID == std.studentID) {
				return true;
			}
			else return false;
		
	}
		return false;
	}
	@Override
	public int hashCode() {
		return studentID;
	}
	
	public class Equalstest {
		public static void main(String[] args) {
			Student studentlee = new Student(100, "이상원");
			Student studentlee2 = studentlee;
			Student studentSang = new Student(100,"이상원");
			
			if(studentlee == studentlee2) {
				System.out.println("studentlee와 studentlee2의 주소는 같다");
			}
			else {
				System.out.println("studentlee와 studentlee2의 주소는 다르다");
			}
			if(studentlee.equals(studentlee2)) {
				System.out.println("둘은 동일하다");
			}
			else {
				System.out.println("둘은 다르다");
			}
			if (studentlee == studentSang) {
				System.out.println("둘의 주소는 같다");
			}
			else {
				System.out.println("둘의 주소는 다르다");
			}
			if(studentlee.equals(studentSang)) {
				System.out.println("동일하다");
			}
			else {
				System.out.println("다르다");
			}
			System.out.println("studentlee의 hashCode : "+studentlee.hashCode());
			System.out.println("studentSang의 hashCode : "+studentSang.hashCode());
			
			System.out.println("studentlee의 실제주소값 : "+System.identityHashCode(studentlee));
			System.out.println("studentSang의 실제 주소값"+ System.identityHashCode(studentSang));
		}
	}
	
	

	
	

}
