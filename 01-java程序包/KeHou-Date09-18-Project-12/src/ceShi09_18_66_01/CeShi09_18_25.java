package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_25 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根。
		// 25. 用程序描述如图
		Scanner ning = new Scanner(System.in);
		System.out.print("你是否为会员：（是/否）");
			String A = ning.next();
			   int B ;
		if (A.equals("是")) {
			System.out.print("本次购物金额：");
				B = ning.nextInt();
			if (B > 200) {
				System.out.print("满200元打7.5折，打折后价格为：");
				System.out.println(B*0.75);
			} else {
				System.out.println("未满200元打8折，打折后价格为：");
				System.out.println(B*0.8);
			}
			
		} else if(A.equals("否")){
			System.out.print("本次购物金额：");
				B = ning.nextInt();
			if (B >= 100) {
				System.out.print("满100元打9折，打折后的价格为：");
				System.out.println(B*0.9);
			}
			
		} else {
			System.out.println("输入错误！！！");
		}

	}

}
