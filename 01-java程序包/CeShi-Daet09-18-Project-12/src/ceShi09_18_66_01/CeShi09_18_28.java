package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_28 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*28. 从键盘上输入一个整数，判断是否能被 3 或 5 整除，
		如果能输出”该数是 3 或 5 的倍数”
		；否则输出”该数不
		能被 3 或 5*/
		Scanner ning = new Scanner(System.in);
		System.out.println("亲输入一个数：");
			int A = ning.nextInt();
		if (A%3 == 0 || A%5 == 0) {
			System.out.println("该数是3或5的倍数");
		} else {
		System.out.println("该数不能被 3 或 5 中的任意一个整除");
		}
	
	}

}
