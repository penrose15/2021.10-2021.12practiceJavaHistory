package template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== 자율 주행 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
		
		//템플렛 매서드는 실행순서, 즉 시나리오를 정의하는 메서드다. 하위 클래스에서 재정의 할 수 없다
        //그래서 앞에 final을 씀
	}

}
