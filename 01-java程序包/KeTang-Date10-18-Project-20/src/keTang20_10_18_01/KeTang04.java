package keTang20_10_18_01;

import java.util.Scanner;
/**
 * 导包
 * @author 寜
 *
 */
public class KeTang04 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		//扫描仪
		Scanner ning = new Scanner(System.in);
		/* 4. 输入一个字符串代表一个邮箱，判断这个邮箱的格式是否正确。
		 *(判断该字符串中是否存在@符号和.号，@的下标要大于0，并且小于.的下标)
		邮箱格式: 124408198@qq.com*/
		System.out.print("输入邮箱号：");
			String youXiang = new String(ning.next());
			int index1 = youXiang.indexOf("@");  
			int index2 = youXiang.indexOf(".");
			if (index1 > 0 && index1 < index2) {
				System.out.println("输入正确");
			} else {
				System.out.println("输入错误");
			
		}
		
	}

}
