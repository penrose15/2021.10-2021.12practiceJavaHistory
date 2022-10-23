package test;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠름");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 점프");
		
	}

	@Override
	public void turn() {
		System.out.println("지원 안함");
		
	}

	@Override
	public void showPlayerInfo() {
		System.out.println("중급자");
		
	}
	

}
