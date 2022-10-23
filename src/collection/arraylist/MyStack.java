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
			System.out.println("������ ������ϴ�");
			return null;
		}
		return(arrayStack.remove(lens-1));   //������ �ǵڿ��� ��Ҹ� ���� �ǵ��� �ڷ� ������ �迭���� ����
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
