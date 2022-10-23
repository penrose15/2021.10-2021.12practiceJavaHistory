package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass; //���� Ŭ���� �ڷ��� ���� ���� ����
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		//static int sInNum = 200; ->���� Ŭ���� �� ���� ���� ���� �Ұ�
		
		void inTest() {
			System.out.println("OutClass num = "+num+"(�ܺ�Ŭ������ �ν��Ͻ� ���� / ���� Ŭ������ �ܺ� Ŭ������ ���� �����)");
			System.out.println("OutClass sNum = "+sNum+"(�ܺ�Ŭ������ ���� ����)");
		}
		//static void sTest() { ���� �޼��� ���� ���� �Ұ��� �ϴ�}
	}
	public void usingClass() {
		inClass.inTest();
	}
}



public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass =new OutClass();
		System.out.println("�ܺ�Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();

	}

}
