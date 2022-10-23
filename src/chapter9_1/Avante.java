package chapter9_1;

public class Avante extends Car {

	@Override
	public void start() {
		System.out.println("Avante가 시동을 겁니다");
		
	}

	@Override
	public void drive() {
		System.out.println("Avante가 출발합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("Avante가 멈춥니다");
		
		
	}

	@Override
	public void turnoff() {
		System.out.println("Avante 시동을 끕니다");
		
	}
	
	}


