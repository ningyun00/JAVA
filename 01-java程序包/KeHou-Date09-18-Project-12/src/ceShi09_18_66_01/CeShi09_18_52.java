package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_52 {

	public static void main(String[] args) {
//		 TODO 自动生成的方法存根
//		52. 分解一个任意长度的整数,计算各个位相加的总和
		Scanner ning = new Scanner(System.in);
			System.out.print("请输入整数：");
				int A = ning.nextInt();//假设A为123;
				int B = 0;
		while (A != 0) {//A不为零;
			B = B + A%10;//B每次加A%10;去最后一位
			A = A/10;	//每次减掉最后一位
		}
		System.out.println(B);		
	}

}
