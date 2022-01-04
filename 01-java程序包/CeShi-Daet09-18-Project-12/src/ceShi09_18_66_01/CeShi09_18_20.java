package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_20 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*20. 从控制台输入一个正整数，计算该数的阶乘。例如输
		入 5，阶乘为 5*4*3*2*1 的结果是 120；
		 */
		Scanner ning = new Scanner(System.in);
		System.out.println("输入一个数计算阶乘：");
			int A = ning.nextInt();
			int B =1;
		for (int i = A; i >= 1; i--) {
			B *= i;
		}
			System.out.println(B);		
	}

}
