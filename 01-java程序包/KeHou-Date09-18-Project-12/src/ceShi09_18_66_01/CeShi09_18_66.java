package ceShi09_18_66_01;

import java.util.Random;

import java.util.Scanner;

public class CeShi09_18_66 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*66. 【步骤 5】实现幸运抽奖功能：登录成功后，用户名
		选择幸运抽奖菜单。输入会员卡号，系统生成 5 个 4 位
		随机数作为幸运数字。如果会员卡号是其中之一，则成为
		本日幸运会员。*/
		
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
			int E = yun.nextInt(9999)+1000;
			int H = 0;
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
					System.out.print("是否继续：");
						B = ning.next();
				if (B.equals("是")) {
					System.out.println("**************************************");
					System.out.println("\t    欢迎进入奖客富翁系统");
					System.out.println("\t\t1.注册");
					System.out.println("\t\t2.登录");
					System.out.println("\t\t3.抽奖");
					System.out.println("**************************************");
					System.out.print("请选择菜单：");
						int I = ning.nextInt();
					if (I == 2) {
						int P = 0;
						do {										
						System.out.println("输入用户名：");
							F = ning.next();
						System.out.println("输入用户密码：");
							G = ning.next();
							P++;
						} while (!(C.equals(F) && D.equals(G)) && !(P == 3));
							if (P == 3) {
								
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
				for (int i = 1; i <= 5; i++) {
					 H = yun.nextInt(9999)+1000;
					System.out.print(H+"\t");
				}
					System.out.println();
				if (E == H) {
					System.out.println("恭喜你是幸运会员");
				} else {
					System.out.println("很遗憾你不是幸运会员");
				}
				break;
			}System.out.print("是否结束：");
				B = ning.next();			
		} while (!B.equals("是"));
		System.out.println("系统退出，谢谢使用。");
	}

}
