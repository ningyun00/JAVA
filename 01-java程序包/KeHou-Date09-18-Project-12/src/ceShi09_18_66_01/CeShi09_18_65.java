package ceShi09_18_66_01;

import java.util.Random;

import java.util.Scanner;

public class CeShi09_18_65 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*65. 【步骤 4】实现登录功能：注册成功后，用户选择“登
		录”菜单，进入登录界面。输入注册时的用户名和密码，
		登录成功，系统提示欢迎信息。如果用户名和密码输入 错
		误，提示用户继续输入，最多有 3 次输入机会。
		*/
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
			int E = yun.nextInt(9999)+1000;
				String B = "",C = "",F = "",D = "",G = "";
		do {
			System.out.println("**************************************");
			System.out.println("\t    欢迎进入奖客富翁系统");
			System.out.println("\t\t1.注册");
			System.out.println("\t\t2.登录");
			System.out.println("\t\t3.抽奖");
			System.out.println("**************************************");
			System.out.print("请选择菜单：");
				int A = ning.nextInt();
			if (A <= 0 || A > 3) {
				System.out.println("输入错误");
			} else {
			switch (A) {
				case 1: 
					System.out.println("奖客富翁系统>注册");
					System.out.println("请填写个人注册信息：");
					System.out.print("用户名：");
						C = ning.next();
					System.out.print("用户密码：");
						D = ning.next();
					System.out.println("会员卡号："+E);
					System.out.println("用户名\t用户密码\t会员卡号");
					System.out.println(C+"\t"+D+"\t"+E);
					System.out.print("是否结束：");
						B = ning.next();
				if (!B.equals("是")) {
					System.out.println("**************************************");
					System.out.println("\t    欢迎进入奖客富翁系统");
					System.out.println("\t\t1.注册");
					System.out.println("\t\t2.登录");
					System.out.println("\t\t3.抽奖");
					System.out.println("**************************************");
					System.out.print("请选择菜单：");
						A = ning.nextInt();
					if (A == 2) {
						System.out.println("奖客富翁系统>登录");
							int P = 0;
						do {										
						System.out.println("输入用户名：");
							F = ning.next();
						System.out.println("输入用户密码：");
							G = ning.next();
							P++;
						if (!(C.equals(F) && D.equals(G))) {
						System.out.println("输入错误");
						} else {
							System.out.println("欢迎您："+C+"登录成功");
						}
						} while (!(C.equals(F) && D.equals(G)) && !(P == 3));
							if (P == 3) {
							break;
							} else {
								System.out.println("欢迎您："+C+"登录成功");
							break;
							}
						
					} else {
						System.out.println("系统退出，谢谢使用。");
					break;
					}
							
				}
				break;
				case 3: 
					System.out.println("奖客富翁系统>抽奖");
				break;
			}
				System.out.print("是否结束：");
					B = ning.next();	
			}
			
		} while (!B.equals("是"));
		System.out.println("系统退出，谢谢使用。");
	}

}
