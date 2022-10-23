package collection.arraylist;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int lens = arrayStack.size();
		if(lens == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		return(arrayStack.remove(lens-1));   //스택의 맨뒤에서 요소를 꺼냄 맨뒤의 자료 꺼내고 배열에서 제거
			}
	public class StackTest {
		public static void main(String[] args) {
			MyStack stack = new MyStack();
			stack.push("A");
			stack.push("B");
			stack.push("C");
			
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		}
	}

}
