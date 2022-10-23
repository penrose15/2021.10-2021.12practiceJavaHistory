package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);  //ť�� �� �ڿ� �߰�
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("ť�� ������ϴ�");
			return null;
		}
		
		return(arrayQueue.remove(0));    //�Ǿ��� �ڷ� ��ȯ�ϰ� �迭���� ����
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
