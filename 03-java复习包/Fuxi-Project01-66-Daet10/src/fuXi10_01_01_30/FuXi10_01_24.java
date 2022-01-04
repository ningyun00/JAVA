package fuXi10_01_01_30;

import java.util.Scanner;

import java.util.Random;

public class FuXi10_01_24 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//24.
		Scanner ning  = new Scanner(System.in);
		Random yun = new Random();
			System.out.print("请输入你的会员卡号：");
				int A = ning.nextInt();
				int B = yun.nextInt(9);
				int C = A/100%10;
		if (B == C) {
			System.out.println("你是幸运会员");
		} else {
			System.out.println("你不是幸运会员");
		}
		
	}

}
