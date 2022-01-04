package ceShi09_18_66_01;

import java.util.Scanner;

public class CeShi09_18_54 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*54. 首先要求用户输入学生的数目放入到变量 n 中，如果
		这个数大于 0，那么就循环 n 次接收 n 个学生的成绩，计
		算总分及平均分。否则输出“学生的人数不能为负数”
		*/
		Scanner ning = new Scanner(System.in);
			System.out.print("请输入学生人数：");
				int A = ning.nextInt();
				int C = 0;
		if(A > 0) {	
			for (int i = 1; i <= A; i++) {
				System.out.print("请输入学生"+i+"的成绩：");
					int B = ning.nextInt();
					C += B;
			}
				System.out.println("总分为："+C);
				System.out.println("平均分为："+(double)(C/A));
		} else {
			System.out.println("学生的人数不能为负数");
		}
	
	}

}
