package singleton;

public class Car {
	public static int carNum = 10000;
	public String createCar;
	public int serialNum;
	

	public Car() {
		Car.carNum++;
		carNum = serialNum;
		
		
	}
	
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
