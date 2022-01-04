package qita03;

import java.util.Scanner;

public class TestAccount01 {

	public static void main(String[] args) {
		//实例化对象
		Account01 acc = new Account01();
		Scanner ning = new Scanner(System.in);
		boolean isExit = false;
		while(true) {
			System.out.println("1.存款2.取款0.退出");
			System.out.println("请选择业务：");
			int choice = ning.nextInt();
			switch (choice) {
			case 1:
				System.out.println("输入存款金额");
				double money = ning.nextDouble();
				acc.saveMoney(money);
				break;
			case 2:
				System.out.println("输入取款金额");
				double takemoney = ning.nextDouble();
				acc.takeMoney(takemoney);
				break;
			case 0:
				System.out.println("谢谢使用");
				isExit = true;
				break;
			}
			if (isExit==true) {
				break;
			}
		}
		
	}

}
