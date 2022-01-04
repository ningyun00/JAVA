package keHou20_10_18_01;

import java.util.Scanner;

/**
 * 导包
 * @author 寜
 *
 */
public class KeHou06 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		//6.录入用户的 18 位身份证号码，从中提取用户的生日
		//实例化对象
		Scanner ning = new Scanner(System.in);
		//输出提示
		System.out.print("输入身份证号：");
			//接收字符串类对象
			String kt = new String(ning.next());
		//判断是否有18位长度
		if (kt.length() == 18) {
			//年
			String no1 = kt.substring(6,10);
			//月
			String no2 = kt.substring(10,12);
			//日
			String no3 = kt.substring(12, 14);
			//输出年月日
			System.out.println(no1+"-"+no2+"-"+no3);
		} else {
			//格式错误
			System.out.println("身份证长度不够");
		}
		
	}

}
