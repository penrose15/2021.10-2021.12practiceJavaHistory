package updown;

import java.util.Scanner;
import java.util.Random;

public class UpDown {
	public int number;
	private int comNum;
	
	public int getcomNum() {
		return comNum;
	}
	public void setcomNum(int comNum) {
		this.comNum = comNum;
	}
	public int selectNum(int number) {
		if(number<0 || number>50) {
			System.out.println("0���� 50������ ���ڸ� ������");
			return 1;
		}
		else return 2;
		
	}
	
	public void number(int number) {
		if(comNum>number) {
			System.out.println(number+"���� �����ϴ�");
		}
		else if(comNum<number) {
			System.out.println(number+"���� �����ϴ�");
		}
		else if(comNum==number) {
			
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UpDown ud = new UpDown();
		
		
		
		
		
		
		
		System.out.println("================================================");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("                    �� �ٿ� ����                   ");
		System.out.println(" ");
		System.out.println("                 1�� ���� �����Ͻÿ�                 ");
		System.out.println("================================================");
		int s = sc.nextInt();
		
		if(s == 1) {
			Random rnd = new Random();
			int input = rnd.nextInt(50);
			ud.setcomNum(input);
			System.out.println("0���� 50������ ���ڸ� ������");
			ud.number = sc.nextInt();
			while(ud.selectNum(ud.number)==2) {
				ud.number(ud.number);
				ud.number = sc.nextInt();
				
				if(ud.comNum == ud.number) {
					System.out.println("�����մϴ� �����Դϴ�!");
					System.out.println("������ �����մϴ�.");
					break;
					
				}
				if (ud.selectNum(ud.number)==1) {
					ud.number = sc.nextInt();
				}
				}
			}
			
		}

	}


