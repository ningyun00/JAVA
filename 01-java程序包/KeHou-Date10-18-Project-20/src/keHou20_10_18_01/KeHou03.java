package keHou20_10_18_01;

import java.util.Scanner;

/**
 * 导包
 * @author 寜
 *
 */
public class KeHou03 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		//3.输入一个字符串，再输入要查找的字符，判断该字符在字符串出现 的次数。 
		Scanner ning = new Scanner(System.in);
		System.out.print("输入一串字符");
			String n1 = new String(ning.next());
		System.out.print("输入你要查找的字符：");
			String n2 = new String(ning.next());
		int sta = 0;
		for (int i = 0; i <= n1.length()-1; i++) {
			String n3 = n1.substring(i, i+1);
			if (n3.equals(n2)) {
				sta++;
			}
			
		}
		System.out.println(sta);
		
	}

}
