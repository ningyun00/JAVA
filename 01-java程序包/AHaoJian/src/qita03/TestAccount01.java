package qita03;

import java.util.Scanner;

public class TestAccount01 {

	public static void main(String[] args) {
		//ʵ��������
		Account01 acc = new Account01();
		Scanner ning = new Scanner(System.in);
		boolean isExit = false;
		while(true) {
			System.out.println("1.���2.ȡ��0.�˳�");
			System.out.println("��ѡ��ҵ��");
			int choice = ning.nextInt();
			switch (choice) {
			case 1:
				System.out.println("��������");
				double money = ning.nextDouble();
				acc.saveMoney(money);
				break;
			case 2:
				System.out.println("����ȡ����");
				double takemoney = ning.nextDouble();
				acc.takeMoney(takemoney);
				break;
			case 0:
				System.out.println("ллʹ��");
				isExit = true;
				break;
			}
			if (isExit==true) {
				break;
			}
		}
		
	}

}
