package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_43 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*43. 输入一个整数，代表有 n 个小时，计算 n 个小时等于
		多少天零多少个小时。比如输入：25，那么输出“1 天零
		1 个小时”*/
		Scanner ning = new Scanner(System.in);
			System.out.println("请输入小时：");
				double A = ning.nextInt();
				double B;	//天
				B = A/24;
			System.out.print((int)B+"天零");
			System.out.println((int)(((A/24)-((int)(B)))*24)+"个小时");
	}

}
