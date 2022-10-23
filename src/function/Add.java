package function;



public class Add {
	int num1;
	int num2;
	
	public int sum(int num1 , int num2) {
		int result;
		result = num1+num2;
		return result;
	}
	public int getTentotal() {
		int i;
		int total = 0;
		for(i=1; i<=10; i++) {
			total +=i;
			
		}
		return total;
	}
	
	void printGreeting(String name) {
		System.out.println("hello"+name);
		return;
	}
		
	
	void divide(int num3, int num4) {
		if (num4 == 0) {
			System.out.println("나누는 수는 0이 될 수 없다");
			return;
		}
		else {
			int result=num3/num4;
			System.out.println(num3+"/"+"="+result+"입니다.");
			
		}
	}

	}


