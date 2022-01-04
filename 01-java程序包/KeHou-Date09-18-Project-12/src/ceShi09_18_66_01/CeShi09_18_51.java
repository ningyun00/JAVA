package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_51 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*51. 一个运输公司规定，每公里运费为 2 元。如果运输公
		里数小于 100 公里的不打折，大于等于 100 公里并小于
		500 公里的打 9 折，大于等于 500 公里的打 8 折。现要
		求输入一个公里数，计算费用
		*/
		Scanner ning = new Scanner(System.in);
		System.out.print("请输入公里数：");	
			int A = ning.nextInt();
		if (A < 100) {
			System.out.println("不打折,价格为："+(A*2));
		}
		if (A >= 100 && A < 500) {
			System.out.println("打9折，价格为："+(A*2*0.9));
		}
		if (A >= 500) {
			System.out.println("打8折，价格为："+(A*2*0.8));
		}

	}

}
