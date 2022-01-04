package qita02;

import java.util.Scanner;

public class TersYuxi02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//实例化管理员
		Yuxi02 yuxi = new Yuxi02();
		while(true) {
			System.out.println("用户名：");
				String name = sc.next();
			System.out.println("密码：");
				String pwd = sc.next();
			if (name.equals(yuxi.userName) && pwd.equals(yuxi.Password)) {
				System.out.println("请输入新密码：");
					yuxi.Password = sc.next();//修改
					System.out.println("修改新密码密码成："+yuxi.Password);
					break;//防止死循环
			} else {
				System.out.println("用户名或密码错误，你无权限");
				
			}
			
		}
		
	}

}
