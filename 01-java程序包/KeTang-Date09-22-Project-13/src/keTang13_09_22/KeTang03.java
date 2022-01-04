package keTang13_09_22;

import java.util.Scanner;

public class KeTang03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//3. 声明一个 int 类型的数组，存储 4 个学生的成绩，计算这 4 个学生的总分及平均
		Scanner ning = new Scanner(System.in);
				int A [] = new int [4];
				int sum = 0;
			System.out.println("请输入4为学生的成绩");
		for (int i = 0; i < A.length; i++) {
			System.out.print("第"+(i+1)+"位学生的成绩");
				A [i]= ning.nextInt();
				sum = sum+A[i];
		}
			System.out.println("平均分为"+sum/A.length);	
	}

}
