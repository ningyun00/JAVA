package keHou20_10_18_01;

import java.util.Scanner;

/**
 * 导包
 * @author 寜
 *
 */
public class KeHou02 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 2.在第一题的基础上面，再加两个要求：
		 * 身份证 16 或 18 位 
		 * 手机号 11 位 
		 */
		//扫描仪
		Scanner ning = new 	Scanner(System.in);
		
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
				
		//成功就提示输出身份证号		
		System.out.print("输入身份证号：");		
		
			//接收字符串
			String sfz = new String(ning.next());
			
		//输出手机号
		System.out.print("输入手机号：");
		
			//接收字符串
			String sjh = new String(ning.next());
			
				//判断身份证是否是16或18
				if (sfz.length()>19||sfz.length()>15) {
					
					//判断手机号是否是11位
					if (sjh.length()==11) {
						
						System.out.println("输入正确");
					} else {
						System.out.println("手机号输入错误。");
					}
				} else {
					System.out.println("身份证输入错误！");
				}
			} else {
				System.out.println("两次密码不同");
			}
		} else {
			System.out.println("用户名或密码长度不够");
		}	
					
	}

}
