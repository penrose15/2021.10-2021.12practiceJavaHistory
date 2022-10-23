package chapter9_1;

public class Genesis extends Car {

	@Override
	public void start() {
		System.out.println("Genesis가 시동을 겁니다");
		
	}

	@Override
	public void drive() {
		System.out.println("Genesis가 출발합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("Genesis가 멈춥니다");
		
		
	}

	@Override
	public void turnoff() {
		System.out.println("Genesis 시동을 끕니다");
		
	}
	
	}


