package fuXi10_01_01_30;

import java.util.Scanner;

public class FuXi10_01_25 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//25.
		Scanner ning = new Scanner(System.in);
		System.out.println("你是否为会员：（是/否）");
			String 	A = ning.next();
			int B;
		if (A.equals("是")) {
			System.out.println("输入本次购物金额：");
			 	B = ning.nextInt();
			if (B > 200) {
				System.out.println("满两百打7.5折，打折后价格为：\n"+(B*0.75));
			} else {
				System.out.println("不满两百打8折，打折后价格为：\n"+(B*0.8));
			}
		} else if (A.equals("否")) {
			System.out.println("输入本次购物金额：");
		 		B = ning.nextInt();
			if (B > 100) {
				System.out.println("满一百打九折，打折后价格为：\n"+(B*0.9));
			}
		
		} else {
			System.out.println("输入错误！！！");
		}
		
	}

}
