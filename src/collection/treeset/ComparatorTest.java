package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		return (s1.compareTo(s2));
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyCompare());  //comparator사용시 treeset생성자에 comparator을 구현한 객체를 매개변수로 전달한다
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);

	}

}
