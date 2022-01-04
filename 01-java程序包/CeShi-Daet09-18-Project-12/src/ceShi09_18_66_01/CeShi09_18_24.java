package ceShi09_18_66_01;

import java.util.Scanner;

import java.util.Random;

public class CeShi09_18_24 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*24. 抽奖规则：会员号的百位数字等于产生的随机数（0-9）
		字即为幸运会员*/
		Scanner ning = new Scanner(System.in);
		Random yun = new Random();
		System.out.print("输入您的会员卡号：");
			int A = ning.nextInt();
			int C = yun.nextInt(9);
			int B = A/100%10;
		if (B == C) {
			System.out.println("恭喜你是幸运会员。");
		} else {
			System.out.println("抱歉你不是幸运会员。");
		}
			
	}

}
