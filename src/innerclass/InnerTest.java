package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass; //내부 클래스 자료형 변수 먼저 설정
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		//static int sInNum = 200; ->내부 클래스 내 정적 변수 선언 불가
		
		void inTest() {
			System.out.println("OutClass num = "+num+"(외부클래스의 인스턴스 변수 / 내부 클래스가 외부 클래스의 변수 사용함)");
			System.out.println("OutClass sNum = "+sNum+"(외부클래스의 정적 변수)");
		}
		//static void sTest() { 정적 메서드 역시 정의 불가능 하다}
	}
	public void usingClass() {
		inClass.inTest();
	}
}



public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass =new OutClass();
		System.out.println("외부클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();

	}

}
