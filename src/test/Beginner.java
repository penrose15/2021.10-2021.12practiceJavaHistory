package test;

public class Beginner extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("달립니다");
	}
	
	@Override
	public void jump() {
		System.out.println("지원안함");
	}
	
	@Override
	public void turn() {
		System.out.println("지원 안해");
	}
	
	@Override
	public void showPlayerInfo() {
		System.out.println("초보자");
	}

}
