package array;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("������ ���°�","��");
		library[1] = new Book("������ ��� ����̴�","ȫ����");
		library[2] = new Book("�� ���� ����� �Ǵ� ��","�ְڳ�");
		library[3] = new Book("����ϰ� �ʹ�","ȫ����");
		library[4] = new Book("����� �鿪��","������");
		
	    for (int i=0;i<library.length;i++) {
	    	library[i].showInfo();  //Book �ν��Ͻ� �����
	    }
	    for (int i=0;i<library.length;i++) {
	    	System.out.println(library[i]); //Book�ν��Ͻ��� ������ �޸� ���� �ּ�
	    }
	}

}
