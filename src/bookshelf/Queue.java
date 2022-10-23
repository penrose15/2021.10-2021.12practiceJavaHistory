package bookshelf;

public interface Queue {
	void enQueue(String title);  //배열의 맨 마지막에 추가
	String deQueue(); //배열 맨처음 항목 반환 
	int getSize();   //현재 Queue의 개수 반환

}
