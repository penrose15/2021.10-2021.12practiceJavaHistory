package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);  //큐의 맨 뒤에 추가
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다");
			return null;
		}
		
		return(arrayQueue.remove(0));    //맨앞의 자료 반환하고 배열에서 제거
	}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue myqueue = new MyQueue();
		myqueue.enQueue("A");
		myqueue.enQueue("B");
		myqueue.enQueue("C");
		
		System.out.println(myqueue.deQueue());
		System.out.println(myqueue.deQueue());
		System.out.println(myqueue.deQueue());

	}

}
