package interfaceex;

public class CompleteCalc extends Calculator{      //CompleteCalc-��Calculator-��Calc

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if (num2 !=0) {
			return num1/num2;
		}
		else {
			return Calc.ERROR;
		}
	}
	@Override
	public int square(int num1, int num2) {
		int result = 1;
		for (int i=0;i<num2;i++) {
			result *= num1;
			if (num2 == 0) {
				result = 1;
			}
		}
		return result;
	}
	
	public String A(String a) {
		return a;
	}
	
	public void showInfo() {
		System.out.println("Calc ���ͺ��̽��� �����Ͽ����ϴ�");
	}

	@Override
	public void description() {
		System.out.println("��ī���� 3�� ���");
		//super.description();
	}

	

}
