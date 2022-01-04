package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*11. 输入一个整数，代表有 n 个小时，计算 n 个小时等于
多少天零多少个小时*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入小时");
			double A = sc.nextDouble();//25
			double C;
			C = A/24;
		System.out.print(((int)(C))+"天");
		//小数点之后已经是属于天//小数天-整数天
		System.out.println((int)(((A/24)-((int)(C)))*24)+"小时");
		//小数之后*24：换成小时	
	}

}
