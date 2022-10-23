package odd_even;

import java.util.Scanner;
import java.util.Random;

//좀 간단하게 만들어 보세요

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
		if (user.equals("홀")) {
			user1=1;
		}
		else if(user.equals("짝")) {
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
		System.out.println("\t홀짝게임\t");
		System.out.println();
		System.out.println("======================");
		System.out.println("홀/짝 둘중 하나를 고르세요");
		
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
				System.out.println("승리하셨습니다");
				ea.usercount++;
				System.out.printf("사용자 : "+ea.usercount);
				System.out.printf("컴퓨터 : "+ea.comcount);
			}
			else if(oe.computer%2 != oe.user1  && oe.user1 != -1) {
				System.out.println("패배하셨습니다");
				ea.comcount++;
				System.out.printf("사용자 : "+ea.usercount);
				System.out.printf("컴퓨터 : "+ea.comcount);
				
			}
			else if(oe.user1 == -1) {
				System.out.println("이상한거 쓰지 마세요");
			}
			else {
				System.out.print("error");
			}
			System.out.println("");
			if(ea.comcount==7) {
				System.out.println("컴퓨터 승리!");
				
			}
			else if(ea.usercount == 7) {
				System.out.println("사용자 승리!");
			}
			else {
				System.out.println("");
			}
			
		}
			
	}

}
