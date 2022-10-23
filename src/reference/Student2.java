package reference;

public class Student2 {
	int studentID;
	String studentName;
	Subject korean;
	Subject math; /*이렇게 하면 korean.subjectName으로 사용할 수 있음, 
	클래스1에 멤버변수를 만들고 클래스2에서 클래스1를 참조변수로 사용하면 클래스2의 참조변수는 클래스1의 멤버변수 사용 가능 
*/
}
