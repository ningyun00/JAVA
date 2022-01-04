package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_53 {

	public static void main(String[] args) {
//		 TODO 自动生成的方法存根
//		53. 输入一个整数代表年，如果这个整数能被 4 整除但不
//		能被 100 整除，或者能被 400 整数，就输出这一年是闰
//		年，否则就输出这一年是平年。
		Scanner ning = new Scanner(System.in);
			System.out.print("请输入年份：");
				int A = ning.nextInt();
		if(A%4 == 0 && A%100 != 0 || A%400 == 0) {
			System.out.println("这一年是闰年");
		}
		System.out.println("这一年是平年");
	}

}
