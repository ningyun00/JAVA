package keTang20_10_18_01;

import java.util.Scanner;
/**
 * 导包
 * @author 寜
 *
 */
public class KeTang03 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		// 3.输入一个小写字符串，输出这个字符串的大写形式。
		//扫描仪
		Scanner ning = new Scanner(System.in);
		//输出提示
		System.out.print("输入小写字符串：");
			//字符串对象
			String minSt = new String(ning.next());
		//输出结果
		System.out.println(minSt.toUpperCase());
	}

}
