package ceShi09_18_66_01;

import java.util.Scanner;

import java.util.Random;

public class CeShi09_18_61 {

	public static void main(String[] args) {
//		 TODO 自动生成的方法存根
//		61. 键盘录入一个数(1-10),然后随机产生一个数，如果电
//		脑大，则输出电脑胜利，玩家大，则输出玩家胜利。
		Scanner ning = new Scanner(System.in);
			Random yun = new Random();
			System.out.print("请输入一个数：");
				int A = ning.nextInt();
			System.out.println("电脑生成中");
				int B = yun.nextInt(10)+1;
		if (A > B) {
			System.out.println("玩家胜利");
		} else {
			System.out.println("电脑胜利");
		}
		
	}

}
