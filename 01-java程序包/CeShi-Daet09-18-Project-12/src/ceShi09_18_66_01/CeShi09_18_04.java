package ceShi09_18_66_01;

import java.util.*;

public class CeShi09_18_04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//4. 循环输入 10 个整数，统计这 10 个整数中有多少个偶数。
		Scanner ning = new Scanner(System.in);
			int B = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println("请输入第"+i+"个数");
				int A = ning.nextInt();
			if (A%2 == 0) {
				B++;
			}
			
		}	
		System.out.println("有"+B+"个偶数");
	}

}
