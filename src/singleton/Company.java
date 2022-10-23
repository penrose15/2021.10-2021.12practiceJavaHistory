package singleton;

public class Company {
	private static Company instance = new Company(); //유일하게 생성된 인스턴스
	private Company() { }  //private로 Company클래스 내에서만 이 클래스 생성 제어
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();   ///인스턴스를 외부에서 참조할 수 있도록 get()메서드 구현
		}
		return instance; //유일하게 생성한 인스턴스 반환
	}
	

}
