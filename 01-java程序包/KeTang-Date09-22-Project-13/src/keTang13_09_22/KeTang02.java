package keTang13_09_22;

import java.util.Scanner;

public class KeTang02 {

	public static void main(String[] args) {
		//2. 声明一个 int 类型的数组, 
		//存储 5 个分数, 找出 5 个分数中的最高分
		
		Scanner ning = new Scanner(System.in);
		System.out.print("请输入五个分数：");
		int A [] = new int[5];
		for (int i = 0; i < A.length; i++) {
			A [i] = ning.nextInt();
		}
			int max = A [0];
		for (int i = 0; i < A.length; i++) {
			if(A [i] > max) {
				max = A[i];
			}
			
		}
		System.out.println("最大值："+max);
	}

}
