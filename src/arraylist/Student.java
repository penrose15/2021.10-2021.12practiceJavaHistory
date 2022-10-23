package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String name;
	ArrayList<Subject> subjectList;  //ArrayList ������� ����
	
	
	public Student(int studentID, String name) { //������
		this.studentID = studentID;
		this.name = name;
		subjectList = new ArrayList<Subject>(); //ArrayList����
	}
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //SubjectŬ���� ����
		subject.setName(name); //���� �̸� �߰�
		subject.setScorePoint(score); //���� ���� �߰�
		subjectList.add(subject); //�迭�� �����ϱ�
	}
	
	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint(); //���� ���ϱ�
			System.out.println("�л�"+name+"��"+ s.getName()+"���� ������ "+s.getScorePoint() +"�Դϴ�");
			
		}
		System.out.println("�л�"+name+"�� ������ "+ total +" �Դϴ�. ");
	}
	
	
	
	
	

}
