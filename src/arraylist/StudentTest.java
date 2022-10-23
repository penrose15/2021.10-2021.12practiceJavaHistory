package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentlee = new Student(1001, "Lee");  //생성자 호출
		studentlee.addSubject("국어", 100); //배열에 추가및 저장
		studentlee.addSubject("수학", 80);  //배열에 추가 및 저장
		
		Student studentkim = new Student(1002,"kim");
		studentkim.addSubject("국어", 70);
		studentkim.addSubject("수학", 80);
		studentkim.addSubject("영어", 100);
		
		studentlee.showStudentInfo();
		System.out.println("======================");
		studentkim.showStudentInfo();

	}

}
