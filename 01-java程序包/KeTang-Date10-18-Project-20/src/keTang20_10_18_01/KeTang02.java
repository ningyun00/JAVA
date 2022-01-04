package keTang20_10_18_01;

import java.util.Scanner;
/**
 * 导包
 * @author 寜
 *
 */
public class KeTang02 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		//扫描仪
		Scanner ning = new Scanner(System.in);
		//2.输入一个用户名，与一个密码，都用字符串保存，判断这个用户名与密码是否都等于HelloJava，不区分大小写。
		// 如果都相等就输出 “登录成功”，否则输出"用户名或密码错误"。
		System.out.print("输入用户名：");
			//字符串对象
			String yuName = new String(ning.next());
		System.out.print("输入密码：");
			//字符串对象
			String miMa = new String(ning.next());
		if (yuName.equalsIgnoreCase("HelloJava") && miMa.equalsIgnoreCase("HelloJava")) {
			System.out.println("输入正确");
		} else {
			System.out.println("用户名或密码错误");
		}
		
	}

}
