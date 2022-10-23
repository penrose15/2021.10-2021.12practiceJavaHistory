package chapter9_1;

public class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("Sonata가 시동을 겁니다");
		
	}

	@Override
	public void drive() {
		System.out.println("Sonata가 출발합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("Sonata가 멈춥니다");
		
		
	}

	@Override
	public void turnoff() {
		System.out.println("Sonata 시동을 끕니다");
		
	}
	
	}


