package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_27 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner ning = new Scanner(System.in);
		System.out.println("请输入年龄：");
			int A = ning.nextInt();
		System.out.println("请输入性别：");
			String B = ning.next();
		if (A > 7 || A >= 5 && B.equals("男")) {
			System.out.println("能搬动");	
		} else {
			System.out.println("不能");
		}
	
	}

}
