package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_26 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner ning = new Scanner(System.in);
		System.out.println("请输入用户名：");
			String A = ning.next();
		System.out.println("请输入密码：");
			int B =ning.nextInt();
		if (A.equals("寜") && B == 123) {
			System.out.println("欢迎你，寜");
			
		} else{
			System.out.println("对不起你不是寜。");
		}
			
	}

}
