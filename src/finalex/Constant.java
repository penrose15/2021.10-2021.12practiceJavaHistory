package finalex;

public class Constant {
	int num = 10;
	final int Num=100;  //����� ����

	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 10;
		cons.Num = 200;  //����� �ٸ� �� ���� x
		
		System.out.println(cons.num);
		System.out.println(cons.Num);
		
		
		

	}

}
