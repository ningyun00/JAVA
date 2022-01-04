package ceShi09_18_66_01;

import java.util.Scanner;

import java.util.Random;

public class CeShi09_18_64 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*64. 【步骤 3】实现注册功能：用户选择注册菜单，进入
		注册界面。系统提示用户输入用户名和密码，系统产生 4
		位随机数作为卡号。注册成功，显示注册信息。
		*/
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
		int E = yun.nextInt(9999)+1000;
		System.out.println("**************************************");
		System.out.println("\t    欢迎进入奖客富翁系统");
		System.out.println("\t\t1.注册");
		System.out.println("\t\t2.登录");
		System.out.println("\t\t3.抽奖");
		System.out.println("**************************************");
		String B = "",C = "",D = "";
		do {
			System.out.print("请选择菜单：");
				int A = ning.nextInt();
			if (A <= 0 || A > 3) {
				System.out.println("输入错误");
			}else {
				switch (A) {
				case 1: 
					System.out.println("奖客富翁系统>注册");
					System.out.println("请填写个人注册信息：");
					System.out.print("用户名：");
						C = ning.next();
					System.out.print("用户密码：");
						D = ning.next();
					System.out.println("会员卡号："+E);
				break;
				case 2: 
					System.out.println("奖客富翁系统>登录");
				break;
				case 3: 
					System.out.println("奖客富翁系统>抽奖");
				break;
				}
			}
			System.out.println("用户名\t用户密码\t会员卡号");
			System.out.println(C+"\t"+D+"\t"+E);
			System.out.print("是否结束：");
				B = ning.next();
		} while (!B.equals("是"));
		System.out.println("系统退出，谢谢使用。");
	}

}
