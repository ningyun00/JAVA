package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//15. 输入三个整形的变量，找出三个数中的最小值。
		Scanner ning = new Scanner(System.in);
		System.out.print("请输入第一个数");
			int A = ning.nextInt();//3 2 2
		System.out.print("请输入第二个数");
			int B = ning.nextInt();//2 3 1
		System.out.print("请输入第三个数");
			int C = ning.nextInt();//1 1 3
		if (A>B) {
			if (B > C) {
				System.out.println(C);
			} else if (B < C) {
				System.out.println(B);
			}
			
		} else if (B > A) {
			if (A > C) {
				System.out.println(C);
			} else if (A < C) {
				System.out.println(A);
			}
			
		}else if (C > A) {
			if (A > B) {
				System.out.println(B);
			} else if (A < B){
				System.out.println(A);
			}
		
		}
	
	}

}
