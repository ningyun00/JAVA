package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_62 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
/*		62. 【步骤 1】实现菜单的输出显示：输出“奖客富翁系
		统”菜单，选择菜单编号， 输出菜单信息。若编号选择
		错误，输出“您的输入有误”
*/
		Scanner ning = new Scanner(System.in);
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
	
		}
	
	}

}
