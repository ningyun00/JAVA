package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_31 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//31. 从键盘输入 3 个不同的数字，输出其中最小的数
		Scanner ning = new Scanner(System.in);
		System.out.println("请输入第一个数字");
			int A = ning.nextInt();
		System.out.println("请输入第二个数字");
			int B = ning.nextInt();
		System.out.println("请输入第三个数字");
	    	int C = ning.nextInt();
	    if(A > B && A > C) {
			if(B > C) {
				System.out.println(C);
			}else {
			    System.out.println(B);
			}
			
		}
		if(B > C && B > A) {
			if(C > A) {
				System.out.println(A);
			}else if(A > C) {
			    System.out.println(C);
			}
			
		}	
		if(C > A && C > B) {
			if(A > B) {
				System.out.println(B);
			}else if(B > A) {
				System.out.println(A);
			}
		
		}	
	
	}

}
