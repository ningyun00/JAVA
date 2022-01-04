package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_42 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//42. 收银系统：首先输入衣服的价格，买了几件。再输入
		//帽子的价格，及个数。输出总价格，然后接收客人所付的
		//钱，最后输出找零
		Scanner ning = new Scanner(System.in);
		int yifu = 0,maozi = 0;
			System.out.print("请输入衣服价格：");
				int A = ning.nextInt();
			System.out.print("请输入购买了几件衣服：");
				int B = ning.nextInt();
			System.out.print("请输入帽子的价格：");
				int C = ning.nextInt();
			System.out.print("请输入购买了几件帽子：");
				int D = ning.nextInt();
			System.out.print("请输入总金额：");
				int E = ning.nextInt();yifu = A*B;maozi = C*D;
			System.out.println("应找零："+(E-yifu-maozi));
	}

}
