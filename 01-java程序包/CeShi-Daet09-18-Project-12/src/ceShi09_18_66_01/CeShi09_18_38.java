package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_38 {

	public static void main(String[] args) {
		
		// TODO 自动生成的方法存根
		/*38. 为小明制定学习计划，周一、周三、周五学习编程，
		周二、周四、周六学习英语，周日休息。输入星期几，输
		出学习内容*/
		Scanner ning = new Scanner(System.in);
			int B = 0;
		System.out.println("请输入星期");
			String A = ning.next();
		if (A.equals("一") || A.equals("三") || A.equals("五")) {
			B = 1;	
		} else if (A.equals("二") || A.equals("四") || A.equals("六")) {
			B = 2;
		} else if (A.equals("日")) {
			B = 3;
		} else {
			System.out.println("输入错误，请重试");
		}
		switch(B) {
		case 1:
			System.out.println("学习编程");
			break;
		case 2:
			System.out.println("学习英语");
			break;
		case 3:
			System.out.println("休息");
			break;
		}
	
	}

}
