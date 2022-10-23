package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String name;
	ArrayList<Subject> subjectList;  //ArrayList 멤버변수 선언
	
	
	public Student(int studentID, String name) { //생성자
		this.studentID = studentID;
		this.name = name;
		subjectList = new ArrayList<Subject>(); //ArrayList생성
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //Subject클래스 선언
		subject.setName(name); //과목 이름 추가
		subject.setScorePoint(score); //과목 점수 추가
		subjectList.add(subject); //배열에 저장하기
	}
	
	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint(); //총점 더하기
			System.out.println("학생"+name+"의"+ s.getName()+"과목 성적은 "+s.getScorePoint() +"입니다");
			
		}
		System.out.println("학생"+name+"의 총점은 "+ total +" 입니다. ");
	}
	
	
	
	
	

}
