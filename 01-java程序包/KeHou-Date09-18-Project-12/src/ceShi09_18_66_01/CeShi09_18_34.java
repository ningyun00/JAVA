package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_34 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*34. 使用 FOR 循环结构实现：从键盘上接收从周一到周
			五每天的学习时间(小时为单位)，并计算每日平均学习时
			间(小时为单位)。*/
		Scanner ning = new Scanner(System.in);
			int B = 0,A = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("请输入周"+i+"的学习时间：");
			  A = ning.nextInt();
			  B += A;
		}
		System.out.println(B/5);
	}

}
