package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		Buy buyer = c;       //Customer 클래스형인 c를 Buy인터페이스형인 buyer에 대입하여 형 변환, 
		buyer.buy();         //buyer는 Buy인터페이스 메서드만 호출 가능하다  
		buyer.order();
		
		Sell seller = c;        //Sell에서 구현한 디폴트 메서드가 아니느 Customer에서 재정의한 메서드가 나옴
		seller.sell();
		seller.order();
		
		if (seller instanceof Customer) {          //seller를 하위 클래스형인 Customer로 다시
			Customer c2 = (Customer)seller;        //형 변환   
			c2.buy();
			c2.sell();
		}
		c.order();
		
		

	}

}
