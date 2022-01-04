package keTang20_10_18_01;
/**
 * 
 * @author 寜
 *
 */
import java.util.Scanner;

public class KeTang01 {
	/**
	 * 主方法
	 * @param args
	 */
	public static void main(String[] args) {
		// 1.输入一个字符串，判断这个字符串的长度如果小于6就输出“长度不够”，否则输出“正确”。
		Scanner ning = new Scanner(System.in);
			System.out.print("输入一个长度的符号：");
		String A = new String(ning.next());
		if (A.length()>6) {
			System.out.println("输入正确");
		} else {
			System.out.println("长度不够");
		}
		
	}

}
