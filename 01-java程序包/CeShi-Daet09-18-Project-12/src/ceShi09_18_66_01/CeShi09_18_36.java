package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_36 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*36. 从键盘接收一批整数，输入 0 退出循环，比较并输出
		其中的最大值和最小值*/
		Scanner ning = new Scanner(System.in);
			int A = 0,C = 0,B = 0,max = 0,min = 0;
		do {
			System.out.println("输入数字：");
				A = ning.nextInt();
			if (A > max) {
				max = A;	
			}
			if (min == 0 || A < min && A != 0) {
				min = A;
			}

		} while (A != 0);
		System.out.println("最大值为："+max+"\n最小值为："+min);
	}

}
