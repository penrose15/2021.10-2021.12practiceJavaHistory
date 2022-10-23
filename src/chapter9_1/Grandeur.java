package chapter9_1;

public class Grandeur extends Car {

	@Override
	public void start() {
		System.out.println("Grandeur가 시동을 겁니다");
		
	}

	@Override
	public void drive() {
		System.out.println("Grandeur가 출발합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("Grandeur가 멈춥니다");
		
		
	}

	@Override
	public void turnoff() {
		System.out.println("Grandeur 시동을 끕니다");
		
	}
	
	}


