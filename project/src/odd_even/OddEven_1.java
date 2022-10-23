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
		System.out.println("\t홀짝게임\t");
		System.out.println();
		System.out.println("======================");
		System.out.println("1.start\t2.end");
	}
	
	
	public void Choose() {
		
		if (user.equals("홀")) {
			user1=1;
		}
		else if(user.equals("짝")) {
			user1 = 0;
		}
		else {
			user1 = -1;
		}
	}
	
	public void Close() {
		System.out.println("게임을 종료합니다");
		System.exit(0);
	}
	
	public void Computerwin() {
		System.out.println("컴퓨터 승리");
		comcount++;
		System.out.println("컴퓨터 : "+comcount);
		System.out.println("사용자 : "+usercount);
	}
	public void Userwin() {
		System.out.println("사용자 승리");
		usercount++;
		System.out.println("컴퓨터 : "+comcount);
		System.out.println("사용자 : "+usercount);
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
				System.out.println("홀/짝 둘 중 하나 고르세요");
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
					System.out.println("이상한거 쓰지 마세요");
				}
				else {
					System.out.print("error");
				}
				System.out.println("");
				if(oe.comcount==7) {
					System.out.println("컴퓨터 승리!");
					/*System.out.println("replay?");
					String a = rp.nextLine();
					if(a.equals("yes")) {
						oe.First();
					}*/
					
				}
				else if(oe.usercount == 7) {
					System.out.println("사용자 승리!");
				}
				else {
					System.out.println("");
				}
				
			}
		}
		else if(oe.start == 2) {
			System.out.println("게임종료");
			System.exit(0);
		}
		else {
			System.out.println("1, 2 둘중 하나를 고르세요");
			System.exit(0);
		}
		
	}
	

}
