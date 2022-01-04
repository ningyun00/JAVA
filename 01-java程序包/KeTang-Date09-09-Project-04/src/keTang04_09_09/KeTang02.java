/**
 * 
 */
package keTang04_09_09;

import java.util.Scanner;

/**
 * @author EDZ
 *
 */
import java.util.Scanner;
public class KeTang02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自动生成的方法存根
		/* 2. 输入任意一个3位数的整数（注意不是3个数字），然后反序输出.
		 * 	例如输入357，那么输出753
		 */	
		 	System.out.println("输入任意一个3位数的整数");
		int zhengShu0 = sc.nextInt();
		if (zhengShu0 <1000) {
			System.out.println("改之前" +zhengShu0);
			  int A = zhengShu0/100;
		      int B = zhengShu0/10%10;
		      int C = zhengShu0%10;
		    System.out.println("改之后"+C+B+A);		     			
		}
	}

}
