package interfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		
		X xClass = m;
		xClass.x();
		
		Y yClass = m;
		yClass.y();
		
		MyInterface my = m;
		my.myMethod();
		my.x();
		my.y();
		

	}

}
