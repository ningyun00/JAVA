package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_09 {

		public static void main(String[] args) {
			/*9. 循环输入大于 0 的数字进行累乘，直到输入的数字为 0，
			就结束循环，并最后输出累乘的结果*/
		Scanner ning = new Scanner(System.in);
			int A,B = 1;
		do {
			System.out.println("请输入一个数");
				A = ning.nextInt();
			if (A == 0) {
				A = 1;
				B = B*A;
			System.out.println(B);
			  break;
			}
			B = B*A;			 
		} while (!(A == 0)) ;
		
	}
		
}