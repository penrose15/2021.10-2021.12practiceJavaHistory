package odd_even;

import java.util.Scanner;
import java.util.Random;

//�� �����ϰ� ����� ������

public class OddEven {
	public int computer;
	public String user;
	public int user1;
	public int comcount=0;
	public int usercount=0;
	public int start;
	
	public OddEven() {}
	
	
	public void Start(int start) {
		this.start=start;
	}
	public OddEven(String user) {
		this.user = user;
		if (user.equals("Ȧ")) {
			user1=1;
		}
		else if(user.equals("¦")) {
			user1 = 0;
		}
		else {
			user1 = -1;
			//System.exit(0);
		}
		}
		
	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("======================");
		System.out.println();
		System.out.println("\tȦ¦����\t");
		System.out.println();
		System.out.println("======================");
		System.out.println("Ȧ/¦ ���� �ϳ��� ������");
		
		//int start = sc.nextInt();
		
		Random rd = new Random();
		
		/*if (start==1) {
			;
		}
		else if(start==2) {
			System.exit(0);
		
		}*/
		
		OddEven ea = new OddEven();
		
		while(ea.comcount<7 && ea.usercount<7) {
			String user = sc.nextLine();
			
			OddEven oe = new OddEven(user);
			oe.computer= rd.nextInt(9);
			
			if(oe.computer%2 == oe.user1) {
				System.out.println("�¸��ϼ̽��ϴ�");
				ea.usercount++;
				System.out.printf("����� : "+ea.usercount);
				System.out.printf("��ǻ�� : "+ea.comcount);
			}
			else if(oe.computer%2 != oe.user1  && oe.user1 != -1) {
				System.out.println("�й��ϼ̽��ϴ�");
				ea.comcount++;
				System.out.printf("����� : "+ea.usercount);
				System.out.printf("��ǻ�� : "+ea.comcount);
				
			}
			else if(oe.user1 == -1) {
				System.out.println("�̻��Ѱ� ���� ������");
			}
			else {
				System.out.print("error");
			}
			System.out.println("");
			if(ea.comcount==7) {
				System.out.println("��ǻ�� �¸�!");
				
			}
			else if(ea.usercount == 7) {
				System.out.println("����� �¸�!");
			}
			else {
				System.out.println("");
			}
			
		}
			
	}

}
