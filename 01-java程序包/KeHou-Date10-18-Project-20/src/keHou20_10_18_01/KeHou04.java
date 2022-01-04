package keHou20_10_18_01;

import java.util.Scanner;

/**
 * 导包
 * @author 寜
 *
 */
public class KeHou04 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		// 4.录入会员生日，形式必须是”月/日”， 如”09/12” 允许用户重复录入，直到输入正确为止 
		Scanner ning = new Scanner(System.in);
		String st1;
		do {
			System.out.print("输入会员生日");
			 	st1 = new String(ning.next());
			if (st1.length()==5&&st1.substring(2, 3).equals("/")) {
				System.out.println("输入正确");
				break;
			} else {
				System.out.println("输入错误");
				System.out.println("日期格式为：月/日“00/00”");
			}
			
		} while (true);
		
	}

}
