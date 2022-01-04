package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_41 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//41. 定义一个四位数的整数，要求编程将这个四位数中的
		//个位，十位，百位，千位分别输出。
		Scanner ning = new Scanner(System.in);
			int A1,A2,A3,A4;
		System.out.print("请输入一个四位数：");
			int A = ning.nextInt();
			A1 = A/1000;
			A2 = A/100%10;
			A3 = A/10%10;
			A4 = A%10;
		System.out.println("个位:"+A4+"十位:"+A3+"百位:"+A2+"千位:"+A1);
	}

}
