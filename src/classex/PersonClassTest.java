package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException{
		Class strClass = Class.forName("classex.Person");
		
		Constructor[ ] c = strClass.getConstructors();
		System.out.println(c);
		
		Field[ ] f = strClass.getFields();
		System.out.println(f);
		
		Method[ ] m = strClass.getMethods();
		System.out.println(m);
		

	}

}
