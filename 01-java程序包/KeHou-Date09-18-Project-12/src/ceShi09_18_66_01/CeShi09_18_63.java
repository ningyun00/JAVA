package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_63 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
/*		63. 【步骤 2】实现循环执行功能：用户选择一项菜单并
		输出菜单信息后，系统询问是否继续？如果继续，则继续
		选择菜单，否则结束系统。
*/
		Scanner ning = new Scanner(System.in);
			String B = null ;
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
				break;
				case 2: 
					System.out.println("奖客富翁系统>登录");
				break;
				case 3: 
					System.out.println("奖客富翁系统>抽奖");
				break;
				}
				
			}System.out.print("是否结束：");
			B = ning.next();
		} while (!B.equals("是"));
		System.out.println("系统退出，谢谢使用。");
	}

}
