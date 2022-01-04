package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*14. 一个运输公司规定，每公里运费为 20 元。如果运输公
		里数小于 100 公里的不打折，大于等于 100 公里并小于
		500 公里的打 9 折，大于等于 500 公里的打 8 折。现要
		求输入一个公里数，计算费用。*/
		Scanner ning = new Scanner(System.in);
			double B;
			System.out.println("请输入公里数：");
				int A = ning.nextInt();
		if(A < 100) {
			B = 20*A;
			System.out.println("不打折费用为"+B);
		} else if (A < 500 && A >= 100) {
			B = 20*A*0.9;
			System.out.println("费用为"+B);
		} else if (A >= 500) {
			B = 20*A*0.8;
			System.out.println("费用为"+B);
		}
			
	}

}
