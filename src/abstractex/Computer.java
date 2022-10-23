package abstractex;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();  //display와 typing은 하뤼 클래스에 따라 구현이 달라짐
	public void turnOn() {
		System.out.println("전원을 킵니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");  //turnon, turnoff는 Computer를 상속 받는 클래스 에게 공통으로 쓰임
	}
}
