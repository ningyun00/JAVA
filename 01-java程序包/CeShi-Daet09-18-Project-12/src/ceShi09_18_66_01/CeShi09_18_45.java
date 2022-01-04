package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_45 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		45. 定义一个变量保存正方形的边长，计算此正方形的周
//		长，及面积。(边长*4,边长*边长)
		Scanner ning = new Scanner(System.in);
		System.out.println("请输入正方形的边长：");
			int A = ning.nextInt();
		System.out.println("周长为："+A*4);
		System.out.println("面积为："+A*A);
	}

}
