package odd_even;

import java.util.Scanner;
import java.util.Random;

public class OddEven_1 {
	public int computer;
	public String user;
	public int user1;
	public int comcount=0;
	public int usercount=0;
	public int start;
	
	void First() {
		System.out.println("======================");
		System.out.println();
		System.out.println("\tȦ¦����\t");
		System.out.println();
		System.out.println("======================");
		System.out.println("1.start\t2.end");
	}
	
	
	public void Choose() {
		
		if (user.equals("Ȧ")) {
			user1=1;
		}
		else if(user.equals("¦")) {
			user1 = 0;
		}
		else {
			user1 = -1;
		}
	}
	
	public void Close() {
		System.out.println("������ �����մϴ�");
		System.exit(0);
	}
	
	public void Computerwin() {
		System.out.println("��ǻ�� �¸�");
		comcount++;
		System.out.println("��ǻ�� : "+comcount);
		System.out.println("����� : "+usercount);
	}
	public void Userwin() {
		System.out.println("����� �¸�");
		usercount++;
		System.out.println("��ǻ�� : "+comcount);
		System.out.println("����� : "+usercount);
	}
	
	public static void main(String[] args) {
		OddEven_1 oe = new OddEven_1();
		
		oe.First();
		Scanner st = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner rp = new Scanner(System.in);
		
		oe.start = st.nextInt();
		
		if (oe.start ==1) {
			while(oe.comcount<7 && oe.usercount<7) {
				System.out.println("Ȧ/¦ �� �� �ϳ� ������");
				oe.user = sc.nextLine();
				
				Random rd = new Random();
				oe.computer= rd.nextInt(9);
				
				
				oe.Choose();
				
				if(oe.computer%2 == oe.user1) {
					oe.Userwin();
				}
				else if(oe.computer%2 != oe.user1  && oe.user1 != -1) {
					oe.Computerwin();
					
				}
				else if(oe.user1 == -1) {
					System.out.println("�̻��Ѱ� ���� ������");
				}
				else {
					System.out.print("error");
				}
				System.out.println("");
				if(oe.comcount==7) {
					System.out.println("��ǻ�� �¸�!");
					/*System.out.println("replay?");
					String a = rp.nextLine();
					if(a.equals("yes")) {
						oe.First();
					}*/
					
				}
				else if(oe.usercount == 7) {
					System.out.println("����� �¸�!");
				}
				else {
					System.out.println("");
				}
				
			}
		}
		else if(oe.start == 2) {
			System.out.println("��������");
			System.exit(0);
		}
		else {
			System.out.println("1, 2 ���� �ϳ��� ������");
			System.exit(0);
		}
		
	}
	

}
