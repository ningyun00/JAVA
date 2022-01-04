package keHou20_10_18_01;

import java.util.Scanner;

/**
 * 导包
 * @author 寜
 *
 */
public class KeHou01 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 1.要求注册的用户名长度不能小于 3，
		 * 密码长度不能小于 6，
		 * 并且注册 时两次输入的密码必须相同，
		 * 如果满足要求，提示注册成功。
		 */
		//扫描仪
		Scanner ning = new Scanner(System.in);
		//输出提示
		System.out.print("输入用户名：");
			//接收字符串并且改成对象类型
			String userName = new String(ning.next());
		//输出提示	
		System.out.print("输入密码：");	
			//接收字符串并且改成对象类型
			String passWord = new String(ning.next());
		//输出提示
		System.out.print("再次输入密码：");
			//接收字符串并且改成对象类型
			String passWord1 = new String(ning.next());
		//判断长度
		if (userName.length()>3||passWord.length()>6) {
			//判断两次密码是否相同
			if (passWord.equals(passWord1)) {
				System.out.println("输入成功");
			} else {
				System.out.println("两次密码不同");
			}
		} else {
			System.out.println("用户名或密码长度不够");
		}	
		
	}

}
