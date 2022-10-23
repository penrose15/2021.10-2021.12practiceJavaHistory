package collection.hashset;

import java.util.HashSet;

public class HashSetTest {  //set인터페이스를 구현한 클래스중 하나(HashSet)

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("하현우");
		hashSet.add("이정길");
		hashSet.add("전규호");
		hashSet.add("김기범");
		hashSet.add("하현우");
		
		System.out.println(hashSet); //순서와 상관없이 출력
	}

}
