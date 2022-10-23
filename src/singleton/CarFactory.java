package singleton;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() { }
	public static int carNum = 10000;
	
	public static CarFactory getinstance() {
		if (instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	}


